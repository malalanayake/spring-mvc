package spring.mvc.domain;

import java.io.Serializable;

import spring.mvc.validator.PersonID;

public class Person implements Serializable {

	private String name;
	@PersonID
	private String id;

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

}
