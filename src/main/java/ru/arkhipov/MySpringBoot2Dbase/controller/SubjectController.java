package ru.arkhipov.MySpringBoot2Dbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.arkhipov.MySpringBoot2Dbase.entity.Student;
import ru.arkhipov.MySpringBoot2Dbase.entity.Subject;
import ru.arkhipov.MySpringBoot2Dbase.service.SubjectService;

import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @GetMapping("/{id}")
    public Subject getSubject(@PathVariable("id") int id){
        return subjectService.getSubject(id);
    }

    @PostMapping
    public Subject saveSubject(@RequestBody Subject student){
        return subjectService.saveSubject(student);
    }

    @PutMapping
    public Subject updateSubject(@RequestBody Subject student){
        return subjectService.saveSubject(student);
    }

    @DeleteMapping("{id}")
    public void deleteSubject(@PathVariable("id") int id){
        subjectService.deleteSubject(id);
    }
}
