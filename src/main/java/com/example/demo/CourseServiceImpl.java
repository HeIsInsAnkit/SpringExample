package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseServiceImpl  implements  CourseService {

    @Autowired
    private CourseDao courseDao;
//    List<Course> list ;


    public  CourseServiceImpl() {
//        list = new ArrayList<>();
//        list.add(new Course(421,"Java","This is java course"));
//        list.add(new Course(521,"Dart","This is Dart course"));
//        list.add(new Course(721,"CPP","This is CPP course"));
    }

    @Override
    public List<Course> getCourses() {
       return courseDao.findAll();
//        return list;
    }

    @Override
    public Course getCourse(long courseId) {
//        Course c = null;
//        for(Course course : list) {
//            if (course.getId() == courseId) {
//                c = course;
//                break;
//            }
//        }
        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
//        list.add(course);
//        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
//        list.forEach(e -> {
//            if(e.getId() == course.getId()) {
//                e.setDescription(course.getDescription());
//                e.setTitle(course.getTitle());
//            }
//        });
//        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
        courseDao.delete(courseDao.getOne(courseId));
//        list=this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
    }

}
