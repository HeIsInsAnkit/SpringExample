package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class restController {

    @Autowired
    private CourseService courseService;

//    @GetMapping("/home")
//    public String home() {
//        return "This is home page";
//    }

//get the course
    @GetMapping("/Course")
    public List<Course> getCourse() {
        return this.courseService.getCourses();
    }

    //get single course
    @GetMapping("/Course/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return  this.courseService.getCourse(Long.parseLong(courseId));
    }

    //add single course
    @PostMapping("/Course")
    public Course addCourse(@RequestBody Course course) {
        return  this.courseService.addCourse(course);
    }

    //update Course
    @PutMapping("/Course")
    public Course updateCourse(@RequestBody Course course) {
        return  this.courseService.updateCourse(course);
    }

    //delete Course
    //get single course
    @DeleteMapping("/Course/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
          try{
              this.courseService.deleteCourse(Long.parseLong(courseId));
              return new ResponseEntity<>(HttpStatus.OK);
          }
          catch (Exception e) {
              return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
          }
    }

}
