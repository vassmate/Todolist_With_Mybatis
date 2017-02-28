package com.cc.todo_app.mb_example.todo_manager;


import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.cc.todo_app.mb_example.connection_factory.ConnectionFactory;
import com.cc.todo_app.mb_example.todo.Todo;
import com.cc.todo_app.mb_example.todo_mapper.TodoMapper;

public class TodoManager {
	
	public static Todo selectTodoById(int id) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			TodoMapper todoMapper = sqlSession.getMapper(TodoMapper.class);
			return todoMapper.selectTodoById(id);
		} finally {
			sqlSession.close();
		}
	}
	
	public static Todo selectTodoByName(String name) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			TodoMapper todoMapper = sqlSession.getMapper(TodoMapper.class);
			return todoMapper.selectTodoByName(name);
		} finally {
			sqlSession.close();
		}
	}
	
	public static ArrayList<Todo> selectAllTodo() {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			TodoMapper todoMapper = sqlSession.getMapper(TodoMapper.class);
			return todoMapper.selectAllTodo();
		} finally {
			sqlSession.close();
		}
	}
	
}
