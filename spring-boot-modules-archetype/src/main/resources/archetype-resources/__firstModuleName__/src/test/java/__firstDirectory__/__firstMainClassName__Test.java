package ${firstPackage};

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
class ${firstMainClassName}Test {

    private MockedStatic<${firstMainClassName}> mockedStatic;

    @BeforeEach
    void setUp() {
        mockedStatic = mockStatic(${firstMainClassName}.class);
    }

    @AfterEach
    void tearDown() {
        mockedStatic.close();
    }


    @Test
    @DisplayName("When public static void main run context")
    void When_publicStaticVoidMain_runContext() {
        ${firstMainClassName}.main(new String[]{});

        mockedStatic.verify(() -> SpringApplication.run(${firstMainClassName}.class, new String[]{}));
    }

}
