package com.mycompany.myapp.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_course")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //描述Auto increment
    @Column(name = "id")
    private Long id;

    //绑定foregin key
    @JoinColumn(name = "user_id", referencedColumnName = "id"/*jhi_user表的ID*/)

    @ManyToOne
    private User user;

    @JoinColumn(name = "course_id", referencedColumnName = "id"/*course表的id*/)
    @ManyToOne
    private Course course;
}
