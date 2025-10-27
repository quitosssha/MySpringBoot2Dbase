package ru.arkhipov.MySpringBoot2Dbase.service;

import org.springframework.stereotype.Service;
import ru.arkhipov.MySpringBoot2Dbase.entity.Student;
import ru.arkhipov.MySpringBoot2Dbase.entity.Subject;

import java.util.List;

@Service
public interface SubjectService {

    List<Subject> getAllSubjects();

    Subject saveSubject(Subject subject);

    Subject getSubject(int id);

    void deleteSubject(int id);
}
