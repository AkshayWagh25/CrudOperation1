package com.example.CrudOperation.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepo repo;
    //localhost:8080/all
    @GetMapping("/allStudents")
    public List<Students>getAllStudent() {
        List<Students> student = repo.findAll();
        return student;

    }
 // get student details by using id
    @GetMapping("/students/{rollNumber}")
    public Students getStudent(@PathVariable int rollNumber){
        Students student = repo.findById(rollNumber).get();
        return student;
    }
// create student
@PostMapping("/students/add")
@ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent(@RequestBody Students students){
        repo.save(students);

}
@PutMapping("/student/update/{roll}")
    public Students updateStudent(@PathVariable int roll){
        Students student = repo.findById(roll).get();
        student.setName("poonam");
        student.setPercentage(82.32);
        repo.save(student);
        return student;

}
    @DeleteMapping("/student/delete/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void removeStudent(@PathVariable int id) {
        Students student = repo.findById(id).get();
        repo.delete(student);
    }

}
