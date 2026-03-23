package com.example.todo.service;

import com.example.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private List<Todo> todos = new ArrayList<>();
    private Long idCounter = 1L;

    // Tüm görevleri listele
    public List<Todo> getAllTodos() {
        return todos;
    }

    // Yeni görev ekle
    public Todo addTodo(Todo todo) {
        todo.setId(idCounter++);
        todos.add(todo);
        return todo;
    }

    // Görev sil
    public void deleteTodo(Long id) {
        todos.removeIf(todo -> todo.getId().equals(id));
    }
}