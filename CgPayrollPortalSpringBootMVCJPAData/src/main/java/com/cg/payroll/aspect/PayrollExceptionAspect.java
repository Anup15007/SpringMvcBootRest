package com.cg.payroll.aspect;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;

public class PayrollExceptionAspect {
	@ExceptionHandler(AssociateDetailsNotFoundException.class)
	public ModelAndView handelAssociateDetailsNotFoundException(Exception e) {
		return new ModelAndView("findAssociateDetailsPage","errorMessage",e.getMessage());
	}
}
