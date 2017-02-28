package com.cc.todo_app.mb_example.todo_mapper;

import java.util.ArrayList;

import com.cc.todo_app.mb_example.todo.Todo;

public interface TodoMapper {
	
	public Todo selectTodoById(int id);
	
	public Todo selectTodoByName(String name);
	
	public ArrayList<Todo> selectAllTodo();
	
}
