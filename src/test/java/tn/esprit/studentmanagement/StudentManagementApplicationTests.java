package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Disabled("Nécessite MySQL : test d'intégration, non exécuté en CI")
class StudentManagementApplicationTests {

    @Test
    void contextLoads() {
    }

}