
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;


public class CalculatorTest {

    @Test
    void add_test() {
        // GIVEN

        // WHEN
        int somme = Calculator.add(1,2);

        //THEN
        assertThat(somme).isEqualTo(3);
    }

    @Test
    void sub_test(){
        // GIVEN
        // WHEN
        int sub = Calculator.sub(3,2);

        //THEN
        assertThat(sub).isEqualTo(1);
    }

    @Test
    void multi_test(){
        //GIVEN
        //WHEN
        int multiply = Calculator.multiply(4,4);
        //THEN
        assertThat(multiply).isEqualTo(16);
    }








}
