package com.mycompany.myapp.config.audit;

import com.mycompany.myapp.service.mapper.CourseMapper;
import com.mycompany.myapp.utils.UserUtility;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserUtility userUtility() { return new UserUtility();}

    @Bean
    public CourseMapper courseMapper() {
        return new CourseMapper();
    }
}
