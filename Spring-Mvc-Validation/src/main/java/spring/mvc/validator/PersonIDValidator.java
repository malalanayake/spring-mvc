package spring.mvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import spring.mvc.service.PersonService;

public class PersonIDValidator implements ConstraintValidator<PersonID, String> {

	@Autowired
	private PersonService personService;

	@Override
	public boolean isValid(String id, ConstraintValidatorContext arg1) {
		if (personService.getPersonByID(id) == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void initialize(PersonID id) {
		// TODO Auto-generated method stub

	}

}
