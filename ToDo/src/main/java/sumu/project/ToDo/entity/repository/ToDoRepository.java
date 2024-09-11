package sumu.project.ToDo.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sumu.project.ToDo.entity.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Integer>{

}
