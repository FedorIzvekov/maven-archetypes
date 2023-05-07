package ${package};

import static org.mockito.Mockito.mockStatic;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(webEnvironment = NONE)
@TestPropertySource(properties = {"spring.main.lazy-initialization=true"})
class ${mainClassName}Test {


    @Test
    @DisplayName("Should context loads")
    void contextLoads() {
    }


    @Test
    @DisplayName("Should run SpringApplication")
    void should_run_springApplication() {
        MockedStatic<SpringApplication> mockedStatic = mockStatic(SpringApplication.class);

        ${mainClassName}.main(new String[]{});

        mockedStatic.verify(() -> SpringApplication.run(${mainClassName}.class, new String[]{}));
        mockedStatic.close();
    }

}
