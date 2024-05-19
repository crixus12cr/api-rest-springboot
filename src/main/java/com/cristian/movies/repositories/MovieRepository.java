package com.cristian.movies.repositories;

import com.cristian.movies.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long>{
    
}
