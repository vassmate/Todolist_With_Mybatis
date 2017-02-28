package com.cc.todo_app.mb_example;

import java.util.ArrayList;

import com.cc.todo_app.mb_example.todo.Todo;
import com.cc.todo_app.mb_example.todo_manager.TodoManager;

import junit.framework.TestCase;

/**
 * Unit test for simple Application
 */
public class AppTest extends TestCase {

	public void testSelectTodoById() {
		Todo todo = TodoManager.selectTodoById(1);
		assert (todo != null);
		assert (todo.getTodoName().equals("Milk"));
	}
	
	public void testSelectTodoByName() {
		Todo todo = TodoManager.selectTodoByName("Milk");
		assert (todo != null);
		assert (todo.getTodoName().equals("Milk"));
	}

	public void testSelectAllTodo() {
		ArrayList<Todo> todoList = TodoManager.selectAllTodo();
		assert (todoList != null && todoList.size() > 0);
		assert (todoList.get(1).getTodoName().equals("Milk"));
	}
}
