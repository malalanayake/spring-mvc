package spring.mvc.domain;

import java.io.Serializable;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;

public class Vehicle implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	@Length(min = 3, max = 10, message = "Model name should be 3 to 10 characters")
	private String model;
	@Min(value = 2000, message = "This is very old we are supporting only above 2000")
	private int year;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
