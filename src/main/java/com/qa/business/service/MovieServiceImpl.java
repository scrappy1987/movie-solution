package com.qa.business.service;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.persistence.repository.MovieRepository;

public class MovieServiceImpl implements MovieService {

	@Inject
	private MovieRepository repo;

	public String getAllMovies() {
		return repo.getAllMovies();
	}

	public String addMovie(String movie) {
		return repo.createMovie(movie);
	}

	public String deleteMovie(Long id) {
		return repo.deleteMovie(id);
	}
	
	public String getAMovie(Long id) {
		return repo.getMovie(id);
	}

	public void setRepo(MovieRepository repo) {
		this.repo = repo;
	}

	
}
