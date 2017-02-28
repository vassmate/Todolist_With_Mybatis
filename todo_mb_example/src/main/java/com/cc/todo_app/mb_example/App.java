package com.cc.todo_app.mb_example;

import java.util.ArrayList;

import com.cc.todo_app.mb_example.todo.Todo;
import com.cc.todo_app.mb_example.todo_manager.TodoManager;

public class App {
	public static void main(String[] args) {
		System.out.println(TodoManager.selectTodoById(2).toString() + "\n");
		
		System.out.println(TodoManager.selectTodoByName("Key").toString() + "\n");
		
		ArrayList<Todo> allTodo = TodoManager.selectAllTodo();
		for (Todo todo : allTodo) {
			System.out.println(todo.toString());
		}
	}
}
