package com.gilsoncoelho.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilsoncoelho.dsmovie.entities.Score;
import com.gilsoncoelho.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
