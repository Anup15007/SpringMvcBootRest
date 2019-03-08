package com.cg.movie.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.movie.beans.Movie;
import com.cg.movie.exceptions.MovieDetailsNotFoundException;
import com.cg.movie.services.MovieServices;
@Controller
public class MovieServicesController {
	@Autowired
	MovieServices movieServices;
	@RequestMapping(value= {"/sayHello"},method=RequestMethod.GET)
	public ResponseEntity<String>sayHello(){
		return new ResponseEntity<String>("Hello world to all from RESTImpl",HttpStatus.OK);
	}
	@RequestMapping(value= {"/getMovieDetails"},method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE,
			headers="Accept=application/json")
	public ResponseEntity<Movie>getMovieDetailsRequestParam(@RequestParam int MovieId)throws MovieDetailsNotFoundException{
		Movie Movie=movieServices.getMovieDetails(MovieId);
		return new ResponseEntity<Movie>(Movie,HttpStatus.OK);

	}
	@RequestMapping(value= {"/getAllMovieDetails"},method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE,
			headers="Accept=application/json")
	public ResponseEntity<List<Movie>>getMovieDetailsPathParam(){
		return new ResponseEntity<List<Movie>>(movieServices.getAllMovieDetails(),HttpStatus.OK);
	}
	@RequestMapping(value= {"/acceptMovieDetails"},method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String>acceptMovieDetails(@ModelAttribute Movie Movie){
		Movie=movieServices.acceptMovieDetails(Movie);
		return new ResponseEntity<>("Movie details successfully addded Movie id:-"+Movie.getMovieId(),HttpStatus.OK);
	}
	@RequestMapping(value= {"/removeMovieDetails"},method=RequestMethod.DELETE,
			consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String>removeMovieDetails(@RequestParam int MovieId){
		movieServices.removeMovieDetails(MovieId);
		return new ResponseEntity<>("Movie details removed successfully :-",HttpStatus.OK);
	}
}
