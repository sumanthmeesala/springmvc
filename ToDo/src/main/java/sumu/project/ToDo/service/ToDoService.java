package sumu.project.ToDo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sumu.project.ToDo.entity.ToDo;
import sumu.project.ToDo.entity.repository.ToDoRepository;

@Component
public class ToDoService {
	
	@Autowired
	private ToDoRepository todoRepo;
	
	public String addToDo(ToDo toDo) {
		todoRepo.save(toDo);
		return "ToDo added successfully!";
	}
	
	public List<ToDo> getAllToDos() {
		return todoRepo.findAll();
	}

}
