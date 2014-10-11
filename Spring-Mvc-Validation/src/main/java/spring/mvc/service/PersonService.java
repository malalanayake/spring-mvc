package spring.mvc.service;

import spring.mvc.domain.Person;

public interface PersonService {
	public Person getPersonByID(String Id);
	public void addNewPerson(Person person);
}
