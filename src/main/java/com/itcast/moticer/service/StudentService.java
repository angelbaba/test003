package com.itcast.moticer.service;

import com.itcast.moticer.dao.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {
    @Autowired
    Student student;
    void attu() {
        student.add(1, 2);
    }
}
