package com.cg.movie.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.movie.beans.Songs;

public interface SongsDAO extends JpaRepository<Songs, Integer> {

}
