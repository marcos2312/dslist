package com.athenaconsultancy.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.athenaconsultancy.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
