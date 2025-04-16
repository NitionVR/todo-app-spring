package com.nition.todoapp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nition.todoapp.models.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long>, PagingAndSortingRepository<Todo, Long> {
    
    List<Todo> findByCompleted(boolean completed);
}
