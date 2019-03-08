package com.cg.movie.exceptions;

public class SongsDetailsNotFoundException extends RuntimeException{
	public SongsDetailsNotFoundException() {
		super();
	}

	public SongsDetailsNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SongsDetailsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public SongsDetailsNotFoundException(String message) {
		super(message);
	}

	public SongsDetailsNotFoundException(Throwable cause) {
		super(cause);
	}
}
