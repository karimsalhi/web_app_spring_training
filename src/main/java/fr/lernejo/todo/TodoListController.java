package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

@RestController
@RequestMapping("/api/todo")
public class TodoListController {

    private final TodoRepository todoRepository;

    TodoListController(TodoRepository todoRepository_) {
        todoRepository = todoRepository_;
    }

    @GetMapping
    public Iterable<TodoEntity> getTodo() {
        return todoRepository.findAll();
    }
    @PostMapping
    void addTodo(@RequestBody TodoEntity todo) {
        todoRepository.save(todo);
    }
}
