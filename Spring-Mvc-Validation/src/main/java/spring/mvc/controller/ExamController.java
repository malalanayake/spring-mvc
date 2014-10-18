package spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import spring.mvc.domain.Employee;

@Controller
public class ExamController {


	@RequestMapping(value="/exam.do")
	public String getValidation(Model model){
		model.addAttribute("employee", new Employee());
		return "exam";
		
	}
	
	@RequestMapping(value="/save_employee.do", method=RequestMethod.POST)
	public String saveEmployee(@Valid @ModelAttribute(value="employee")  Employee employee, BindingResult result){
		if(result.hasErrors()){
			//model.addAttribute(employee);
			return "exam";
		}
		
		return "employee_data";
		
	}
}
