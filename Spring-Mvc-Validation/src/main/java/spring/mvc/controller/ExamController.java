package spring.mvc.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;
import org.springframework.web.servlet.support.RequestContextUtils;

import spring.mvc.domain.Employee;

@Controller
public class ExamController {

	@RequestMapping(value = "/exam.do")
	public String getValidation(Model model) {
		model.addAttribute("employee", new Employee());
		return "exam";

	}

	@RequestMapping(value = "/save_employee.do", method = RequestMethod.POST)
	public String saveEmployee(
			@Valid @ModelAttribute(value = "employee") Employee employee,
			BindingResult result) {
		if (result.hasErrors()) {
			// model.addAttribute(employee);
			return "exam";
		}

		return "employee_data";

	}

	@RequestMapping(value = "/language/{name}", method = RequestMethod.GET)
	public String changeLanguage(@PathVariable("name") String name,
			HttpServletRequest request, HttpServletResponse response) {
		if (name.equals("en")) {
			RequestContextUtils.getLocaleResolver(request).setLocale(request,
					response, Locale.ENGLISH);
		}

		if (name.equals("zh")) {
			RequestContextUtils.getLocaleResolver(request).setLocale(request,
					response, Locale.CHINESE);

		}

		return "redirect:/exam.do";

	}
}
