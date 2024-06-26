package org.example.TP2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ApplicationConfig {

    @Bean
    public StudentRepository studentRepository() {
        return new InMemoryStudentRepository();
    }

    @Bean
    public StudentService studentService() {
        return new StudentServiceImpl();
    }
}