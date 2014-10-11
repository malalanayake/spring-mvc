package spring.mvc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.mvc.domain.Person;
import spring.mvc.domain.Stock;
import spring.mvc.domain.Vehicle;
import spring.mvc.service.PersonService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private PersonService personService;

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		return "main";
	}

	@RequestMapping(value = "/person.do", method = RequestMethod.GET)
	public String person(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("person", new Person());

		return "person";
	}

	@RequestMapping(value = "/person_save.do", method = RequestMethod.POST)
	public String personSave(@Valid Person person, BindingResult bindingResult,
			Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("vehicle", new Vehicle());
		if (bindingResult.hasErrors()) {
			return "person";
		} else {
			personService.addNewPerson(person);
			return "person_view";
		}
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/vehicle.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("vehicle", new Vehicle());

		return "vehicle";
	}

	@RequestMapping(value = "/save_vehicle.do", method = RequestMethod.POST)
	public String saveVehical(@Valid Vehicle vehicle,
			BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "vehicle";
		} else {
			return "vehicle_view";
		}
	}
	

	@RequestMapping(value = "/stock.do", method = RequestMethod.GET)
	public String stock(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("stock", new Stock());

		return "stock";
	}

	@RequestMapping(value = "/stock_save.do", method = RequestMethod.POST)
	public String saveStock(@Valid Stock stock,
			BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "stock";
		} else {
			return "stock_view";
		}
	}

}
