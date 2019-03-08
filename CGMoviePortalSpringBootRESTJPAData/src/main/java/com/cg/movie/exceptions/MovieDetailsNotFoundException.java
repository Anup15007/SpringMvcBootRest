package com.cg.movie.exceptions;

public class MovieDetailsNotFoundException extends RuntimeException {
	public MovieDetailsNotFoundException() {
		super();
	}

	public MovieDetailsNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MovieDetailsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public MovieDetailsNotFoundException(String message) {
		super(message);
	}

	public MovieDetailsNotFoundException(Throwable cause) {
		super(cause);
	}
}
