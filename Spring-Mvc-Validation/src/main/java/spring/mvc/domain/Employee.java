package spring.mvc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Employee implements Serializable {
	
	@NotEmpty(message = "{employee.name.notempty}")
	@Size(min = 2, max = 10, message = "{employee.name.size}")
	String empName;
	
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Past(message = "{birth.day.past}")
	Date birthDay;
	
	@Valid
	User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

}
