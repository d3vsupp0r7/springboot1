package org.lba.springboot1.web.form;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployeeForm implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6410115559870407215L;

	@NotNull
    @Size(min=2, max=30)
    private String name;
	
	@NotNull
    @Size(min=2, max=30)
    private String surname;

   // @NotNull
    @Min(18)
    private Integer age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "EmployeeForm [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}
    
	
}
