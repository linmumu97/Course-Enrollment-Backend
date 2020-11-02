package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.service.CourseService;
import com.mycompany.myapp.service.dto.CourseDto;
import com.mycompany.myapp.utils.UserUtility;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping(path = "/api")
public class CourseController {

    private UserUtility userUtility; //instance - 实例
    private CourseService courseService;

//    @PostMapping(path = "/course/enrollment/{courseName}")
//    public void enrollCourse(@PathVariable String courName) {

//    private UserUtility userUtility;
//
//    public CourseController(UserUtility userUtility) {
//        this.userUtility = userUtility;


    //POST : /course/enrollment
    //Request body : {courseName}/course object
    //Response body : null
    //Header: user token
    @PostMapping(path = "/course/enrollment")

    public void enrollCourse(@RequestBody CourseDto courseDto) {
        String courseName = courseDto.getCourseName();
        String userName = userUtility.getUserName();

        courseService.enrollCourse(courseName, userName);


    }

    //GET : /course
    //RequestBody: null
    //ResponseBody: [course object]
    //Header: Need authorized

    @GetMapping (path = "/course")
    public List<CourseDto> getAllCourse() {
        return courseService.getAllCourses();
    }

    //GET: /course/enrollment
    //RequestBody: null
    //RequestBody: [course object]
    //Header: user token
    @GetMapping(path = "/course/enrollment")
    public List<CourseDto> getEnrolledCourses() {
        String userName = userUtility.getUserName();
        return courseService.getEnrolledCourses(userName);
    }



    //DELETE: /course/enrollment/{courseName}
    //RequestBody : null
    //ResponseBody: void
    //Header: user token
    @DeleteMapping(path = "/course/enrollment/{courseName}")
    public void dropCourse(@PathVariable String courseName) {
        //String courseName = userUtility.getCourseName();
        String userName = userUtility.getUserName();
        courseService.dropCourse(courseName, userName);
    }

}
