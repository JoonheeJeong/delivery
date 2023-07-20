package hello.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class AppConfig {

    @Bean
    public EntityManager entityManager() {
        return Persistence.createEntityManagerFactory("hello_jpa")
                        .createEntityManager();
    }
}
