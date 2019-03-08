package com.cg.movie.aspect;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.movie.exceptions.MovieDetailsNotFoundException;
import com.cg.movie.response.MovieResponse;


@ControllerAdvice
public class MovieExceptionAspect {
	@ExceptionHandler(MovieDetailsNotFoundException.class)
	public ResponseEntity<MovieResponse>handelAssociaateDetailsNotFoundException(Exception e){
		MovieResponse response=new MovieResponse(e.getMessage(),HttpStatus.EXPECTATION_FAILED.value());
		return new ResponseEntity<>(response,HttpStatus.EXPECTATION_FAILED);
	}
}
