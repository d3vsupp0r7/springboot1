package org.lba.springboot1.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

public interface EmployeeController {

	//Create
	public String addEmployeeForm(Model model);
	
	//Read
	/**
	 * Show read page
	 * @return
	 */
	public ModelAndView readEmployees();
	
	//Update
	/**
	 * Show Update page
	 * @param id
	 * @param model
	 * @return
	 */
	public String updateEmployeeForm(@PathVariable("id") long id, Model model);
	
	//Delete
	/**
	 * Show a delete success/failed page
	 * @param id
	 * @param model
	 * @return
	 */
	public String deleteEmployeeForm(@PathVariable("id") long id, Model model);
	
}
