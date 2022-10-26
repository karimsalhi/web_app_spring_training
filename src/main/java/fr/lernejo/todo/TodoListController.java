package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

@RestController
@RequestMapping("/api/todo")
public class TodoListController {

    private final List<Todo> todos = new ArrayList<>();

    @PostMapping
    void addTodo(@RequestBody Todo todo) {
        todos.add(todo);
    }

    @GetMapping
    Collection<Todo> getTodos() {
        return todos;
    }
}