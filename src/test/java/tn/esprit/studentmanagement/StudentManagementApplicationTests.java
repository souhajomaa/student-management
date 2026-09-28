import org.junit.jupiter.api.Disabled;

@SpringBootTest
@Disabled("Nécessite MySQL : test d'intégration, non exécuté en CI")
class StudentManagementApplicationTests {
    @Test
    void contextLoads() {
    }
}