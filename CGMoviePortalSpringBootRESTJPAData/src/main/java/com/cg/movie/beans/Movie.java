package com.cg.movie.beans;

import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int movieId;
	private String movieName;
	private String movieType;
	private String directorName;
	@OneToMany(mappedBy="movie")
	@MapKey
	private Map<Integer,Songs> movieSongs;
	public Movie(String movieName, String movieType, String directorName, Map<Integer, Songs> movieSongs) {
		super();
		this.movieName = movieName;
		this.movieType = movieType;
		this.directorName = directorName;
		this.movieSongs = movieSongs;
	}
	public Movie() {}
	public Movie(int movieId, String movieName, String movieType, String directorName, Map<Integer,Songs> movieSongs) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieType = movieType;
		this.directorName = directorName;
		this.movieSongs = movieSongs;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieType() {
		return movieType;
	}
	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public Map<Integer,Songs> getMovieSongs() {
		return movieSongs;
	}
	public void setMovieSongs(Map<Integer,Songs> movieSongs) {
		this.movieSongs = movieSongs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directorName == null) ? 0 : directorName.hashCode());
		result = prime * result + movieId;
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + ((movieSongs == null) ? 0 : movieSongs.hashCode());
		result = prime * result + ((movieType == null) ? 0 : movieType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (directorName == null) {
			if (other.directorName != null)
				return false;
		} else if (!directorName.equals(other.directorName))
			return false;
		if (movieId != other.movieId)
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (movieSongs == null) {
			if (other.movieSongs != null)
				return false;
		} else if (!movieSongs.equals(other.movieSongs))
			return false;
		if (movieType == null) {
			if (other.movieType != null)
				return false;
		} else if (!movieType.equals(other.movieType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieType=" + movieType + ", directorName="
				+ directorName + ", movieSongs=" + movieSongs + "]";
	}
}