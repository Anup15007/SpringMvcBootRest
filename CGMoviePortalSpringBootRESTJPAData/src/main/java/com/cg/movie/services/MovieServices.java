package com.cg.movie.services;

import java.util.List;

import com.cg.movie.beans.Movie;
import com.cg.movie.beans.Songs;
import com.cg.movie.exceptions.MovieDetailsNotFoundException;


public interface MovieServices {
	Movie acceptMovieDetails(Movie movie);

	Songs acceptSongDetails(Songs song);

	Movie getMovieDetails(int movieId)throws MovieDetailsNotFoundException;

	List<Movie> getAllMovieDetails();
	boolean removeMovieDetails(int associateId)throws MovieDetailsNotFoundException;
}
