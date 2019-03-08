package com.cg.movie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.movie.beans.Movie;
import com.cg.movie.beans.Songs;
import com.cg.movie.daoservices.MovieDAO;
import com.cg.movie.daoservices.SongsDAO;
import com.cg.movie.exceptions.MovieDetailsNotFoundException;
@Component("movieServices")
public class MovieServicesImpl implements MovieServices {
	@Autowired
	private MovieDAO movieDao;
	private SongsDAO songsDao;
	@Override
	public Movie acceptMovieDetails(Movie movie) {
		movie = movieDao.save(movie);
		return movie;
	}

	@Override
	public Songs acceptSongDetails(Songs song) {
	song=songsDao.save(song);
	return song;
	}

	@Override
	public Movie getMovieDetails(int movieId) throws MovieDetailsNotFoundException {
		return movieDao.findById(movieId).orElseThrow(()->new MovieDetailsNotFoundException("Movie Details Not Found for movieId"+movieId));
	}

	@Override
	public List<Movie> getAllMovieDetails() {
		return movieDao.findAll();
	}

	@Override
	public boolean removeMovieDetails(int movieId) throws MovieDetailsNotFoundException {
		movieDao.delete(getMovieDetails(movieId));
		return true;
	}

}
