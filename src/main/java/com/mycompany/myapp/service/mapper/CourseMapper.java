package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Course;
import com.mycompany.myapp.service.dto.CourseDto;

/**
 * Course mapper which converts Course to CourseDto
 */

public class CourseMapper {

    public CourseDto convertToCourseDto(Course course) {
        return CourseDto.builder()
            .courseContent(course.getCourseContent())
            .courseLocation(course.getCourseLocation())
            .courseName(course.getCourseName())
            .teacherId(course.getTeacherId().intValue())
            .build();

    }
}
