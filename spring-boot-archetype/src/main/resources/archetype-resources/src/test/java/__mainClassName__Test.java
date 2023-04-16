package ${package};

import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.springframework.boot.SpringApplication;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
class ${mainClassName}Test {

    private MockedStatic<${mainClassName}> mockedStatic;

    @BeforeEach
    void setUp() {
        mockedStatic = mockStatic(${mainClassName}.class);
    }

    @AfterEach
    void tearDown() {
        mockedStatic.close();
    }


    @Test
    @DisplayName("When public static void main run context")
    void When_publicStaticVoidMain_runContext() {
        ${mainClassName}.main(new String[]{});

        mockedStatic.verify(() -> SpringApplication.run(${mainClassName}.class, new String[]{}));
    }

}
