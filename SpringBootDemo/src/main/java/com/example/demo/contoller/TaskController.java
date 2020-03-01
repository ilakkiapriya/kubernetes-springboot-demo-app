package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.constant.*;
import com.example.demo.model.Tasks;
import com.example.demo.repository.TaskRepository;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    /* List added tasks. */
    @RequestMapping(value="/listTask", method=RequestMethod.GET)
    public String listTaskList(Model model) {
        List<Tasks> taskList = this.taskRepository.findAll();

        model.addAttribute(ConstantVariable.TASK_LIST, taskList);

        return "listTask";
    }

    /* Display add task form page. */
    @RequestMapping(value="/addTasksPage", method=RequestMethod.GET)
    public String addTasksPage() {
        return "addTask";
    }

    /* Add user submitted task info to h2 database and redirect to list tasks page. */
    @RequestMapping(value="/addTask", method=RequestMethod.POST)
    public String addTask(Tasks task) {
        taskRepository.save(task);
        return "redirect:/tasks/listTask";
    }
}