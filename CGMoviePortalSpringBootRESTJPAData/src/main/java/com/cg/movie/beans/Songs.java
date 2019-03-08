package com.cg.movie.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Songs {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int SongsId;
	private String SongsName;
	private int SongsLength;
	@ManyToOne
	Movie movie;
	public Songs() {}
	public Songs(int SongsId, String SongsName, int SongsLength, Movie movie) {
		super();
		this.SongsId = SongsId;
		this.SongsName = SongsName;
		this.SongsLength = SongsLength;
		this.movie = movie;
	}
	public int getSongsId() {
		return SongsId;
	}
	public void setSongsId(int SongsId) {
		this.SongsId = SongsId;
	}
	public String getSongsName() {
		return SongsName;
	}
	public void setSongsName(String SongsName) {
		this.SongsName = SongsName;
	}
	public int getSongsLength() {
		return SongsLength;
	}
	public void setSongsLength(int SongsLength) {
		this.SongsLength = SongsLength;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
		result = prime * result + SongsId;
		result = prime * result + SongsLength;
		result = prime * result + ((SongsName == null) ? 0 : SongsName.hashCode());
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
		Songs other = (Songs) obj;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		if (SongsId != other.SongsId)
			return false;
		if (SongsLength != other.SongsLength)
			return false;
		if (SongsName == null) {
			if (other.SongsName != null)
				return false;
		} else if (!SongsName.equals(other.SongsName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Songs [SongsId=" + SongsId + ", SongsName=" + SongsName + ", SongsLength=" + SongsLength + ", movie=" + movie
				+ "]";
	}
}