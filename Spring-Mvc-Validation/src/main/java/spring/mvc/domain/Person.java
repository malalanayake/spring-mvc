package spring.mvc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

import spring.mvc.validator.PersonID;

public class Person implements Serializable {

	private String name;
	@PersonID
	private String id;

	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date birth_date;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date emp_date;

	public Date getEmp_date() {
		return emp_date;
	}

	public void setEmp_date(Date emp_date) {
		this.emp_date = emp_date;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
