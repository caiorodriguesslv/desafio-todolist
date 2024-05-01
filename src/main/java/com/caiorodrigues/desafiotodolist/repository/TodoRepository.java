package com.caiorodrigues.desafiotodolist.repository;

import com.caiorodrigues.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
