package org.lba.springboot1.controller.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.lba.springboot1.controller.EmployeeController;
import org.lba.springboot1.model.Employee;
import org.lba.springboot1.service.EmployeeService;
import org.lba.springboot1.web.form.EmployeeForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee-web")
public class EmployeeControllerImpl implements EmployeeController{

	final static Logger logger = Logger.getLogger(EmployeeControllerImpl.class);

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/addEmployeeForm")
	public String addEmployeeForm(Model model) {
		model.addAttribute("employee", new EmployeeForm());
		return "addEmployeeForm";
	}

	@GetMapping("/readEmployees")
	public ModelAndView readEmployees() {

		List<Employee> listEmployees = employeeService.listAllEmployees();
		Map<String, Object> params = new HashMap<>();
		params.put("listEmployees", listEmployees);

		return new ModelAndView("readEmployees", params);

	}

	@GetMapping("/updateEmployeeForm")
	public String updateEmployeeForm(EmployeeForm personForm) {
		return "updateEmployeeForm";
	}

	@GetMapping("/deleteEmployeeForm")
	public String deleteEmployeeForm(EmployeeForm personForm) {
		return "deleteEmployeeForm";
	}

	@PostMapping("/addEmployee")
	public String checkEmployeeInfo(@Valid  @ModelAttribute("employee") EmployeeForm employeeForm, BindingResult bindingResult) {

		logger.debug("Employee form: " + employeeForm.toString());

		if (bindingResult.hasErrors()) {
			return "addEmployeeForm";
		}

		Employee employee = new Employee(employeeForm.getName(), employeeForm.getSurname());
		employeeService.saveEmployee(employee);

		return "redirect:/readEmployees";
	}
}
