package com.jiseok.todolist.service.todo;

import java.util.List;

import com.jiseok.todolist.web.dto.todo.CreateTodoReqDto;
import com.jiseok.todolist.web.dto.todo.TodoListRespDto;
import com.jiseok.todolist.web.dto.todo.UpdateTodoReqDto;

public interface TodoService {
	
	// 추가
	public boolean createTodo(CreateTodoReqDto createTodoReqDto) throws Exception;
	
	// 수정
	
	// 삭제
	
	// 조회
	public List<TodoListRespDto> getTodoList(String type, int page, int contentCount) throws Exception;
	public boolean updateTodoComplete(int todoCode) throws Exception;
	public boolean updateTodoImportance(int todoCode) throws Exception;
	public boolean updateTodo(UpdateTodoReqDto updateTodoReqDto) throws Exception;
	public boolean removeTodo(int todoCode) throws Exception;
}
