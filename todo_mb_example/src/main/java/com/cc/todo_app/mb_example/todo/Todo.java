package com.cc.todo_app.mb_example.todo;

public class Todo {

	private int todoId;
	private String todoName;
	private String todoDescription;

	public int getTodoId() {
		return todoId;
	}

	public void setTodoId(int categoryId) {
		this.todoId = categoryId;
	}

	public String getTodoName() {
		return todoName;
	}

	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}

	public String getTodoDescription() {
		return todoDescription;
	}

	public void setTodoDescription(String todoDescription) {
		this.todoDescription = todoDescription;
	}

	@Override
	public String toString() {
		return "Todo_Id: " + this.getTodoId() + " Todo_Name: " + this.getTodoName() + " Todo_Description: '"
				+ this.getTodoDescription() + "'";
	}

}
