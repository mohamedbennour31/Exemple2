package tn.esprit.studentmanagement;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class StudentManagementApplicationTests {

    @Autowired
    private ApplicationContext context;

    @Test
    void contextLoads() {
        // Cette assertion vérifie que le contexte Spring Boot 
        // a démarré correctement et n'est pas nul.
        assertThat(context).isNotNull();
    }
}
