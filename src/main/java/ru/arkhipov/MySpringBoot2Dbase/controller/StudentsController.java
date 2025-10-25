package ru.arkhipov.MySpringBoot2Dbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.arkhipov.MySpringBoot2Dbase.entity.Student;
import ru.arkhipov.MySpringBoot2Dbase.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentsController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return studentService.getStudent(id);
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable("id") int id){
        studentService.deleteStudent(id);
    }
}
