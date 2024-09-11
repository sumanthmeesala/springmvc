package sumu.project.ToDo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import sumu.project.ToDo.entity.ToDo;
import sumu.project.ToDo.service.ToDoService;

@RestController
public class ToDoController {
	
	@Autowired
	private ToDoService toDoService;
	
	@GetMapping("/")
	public ModelAndView displayToDo() {
		ModelAndView mv = new ModelAndView();
		List<ToDo> todos = toDoService.getAllToDos();
		mv.addObject("todos", todos);
		mv.setViewName("Todo.jsp");
		return mv;
	}
	
	@PostMapping("/add")
	public ModelAndView addToDo(@ModelAttribute ToDo toDo) {
		toDoService.addToDo(toDo);
		ModelAndView mv = new ModelAndView();
		List<ToDo> todos = toDoService.getAllToDos();
		mv.addObject("todos", todos);
		mv.setViewName("Todo.jsp");
		return mv;
	}
	
}
