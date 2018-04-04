package myproject.com.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import myproject.com.model.*;

import myproject.com.model.Database;

//http://docs.spring.io/spring/docs/current/spring-framework-reference/html/validation.html#validation-mvc-configuring
@Component
public class DatabaseFormValidator implements Validator {

	@Override
	public void validate(Object target, Errors errors) {

		Database database = (Database) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "host", "NotEmpty.database.host");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "port", "NotEmpty.database.port");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sid", "NotEmpty.database.sid");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty.database.username");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password","NotEmpty.udatabase.password");

		
		}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	}
