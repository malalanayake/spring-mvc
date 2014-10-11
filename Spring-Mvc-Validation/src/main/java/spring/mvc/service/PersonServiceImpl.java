package spring.mvc.service;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import spring.mvc.domain.Person;

@Service
public class PersonServiceImpl implements PersonService{
	private static ConcurrentHashMap<String,Person> repo = new ConcurrentHashMap<String,Person>();
	@Override
	public Person getPersonByID(String Id) {
		return (Person)repo.get(Id);
	}

	@Override
	public void addNewPerson(Person person) {
		repo.put(person.getId(), person);
	}

}
