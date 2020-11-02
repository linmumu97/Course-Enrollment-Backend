package com.mycompany.myapp.service.dto;

//DTO - data transfer object
//负责前段后后端交流的数据格式

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseDto {
    private String courseName;
    private String courseLocation;
    private String courseContent;
    private Integer teacherId;


}
