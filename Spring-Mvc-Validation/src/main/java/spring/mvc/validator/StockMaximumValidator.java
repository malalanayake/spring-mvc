package spring.mvc.validator;

import java.math.BigDecimal;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

import spring.mvc.domain.Stock;

public class StockMaximumValidator implements
		ConstraintValidator<StockMaximum, Stock> {
	BigDecimal maxValue = new BigDecimal(20000.00);

	String quantity;
	String max_storage;

	public void initialize(StockMaximum constraintAnnotation) {
		quantity = constraintAnnotation.quantity();
		max_storage = constraintAnnotation.maxStorage();

	}

	@Override
	public boolean isValid(Stock product,
			final ConstraintValidatorContext context) {
		int quantity;
		int max_storage;

		quantity = product.getQuantity();
		max_storage = product.getMax_storage();

		if (quantity > max_storage)
			return false;

		return true;
	}
}
