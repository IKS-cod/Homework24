package pro.sky.Homework24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pro.sky.Homework24.exception.NotFoundException;
import pro.sky.Homework24.exception.NotValidationArgumentException;
import pro.sky.Homework24.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceParameterizedTest {
    CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
            "5, 5",
            "-5, -5",
    })
    void testMethodPlusNegativeAndPositiveParameters(Integer num1, Integer num2) {
        Integer sum = num1 + num2;
        Assertions.assertEquals(sum, calculatorService.plus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
            " , 5",
            " 5 , ",
            "  , ",
    })
     void testMethodPlusThrowsException(Integer num1, Integer num2) {
        assertThrows(NotFoundException.class, () -> {calculatorService.plus(num1, num2);});
    }

        @ParameterizedTest
        @CsvSource({
                "5, 5",
                "-5, -5",
        })
        void testMethodMinusNegativeAndPositiveParameters (Integer num1, Integer num2){
            Integer minus = num1 - num2;
            Assertions.assertEquals(minus, calculatorService.minus(num1, num2));
        }
    @ParameterizedTest
    @CsvSource({
            " , 5",
            " 5 , ",
            "  , ",
    })
    void testMethodMinusThrowsException(Integer num1, Integer num2) {
        assertThrows(NotFoundException.class, () -> {calculatorService.minus(num1, num2);});
    }
        @ParameterizedTest
        @CsvSource({
                "5, 5",
                "-5, -5",
        })
        void testMethodMultiplyNegativeAndPositiveParameters (Integer num1, Integer num2){
            Integer multiply = num1 * num2;
            Assertions.assertEquals(multiply, calculatorService.multiply(num1, num2));
        }
    @ParameterizedTest
    @CsvSource({
            " , 5",
            " 5 , ",
            "  , ",
    })
    void testMethodMultiplyThrowsException(Integer num1, Integer num2) {
        assertThrows(NotFoundException.class, () -> {calculatorService.multiply(num1, num2);});
    }
        @ParameterizedTest
        @CsvSource({
                "5, 5",
                "-5, -5",
        })
        void testMethodDivideNegativeAndPositiveParameters (Integer num1, Integer num2){
            Integer divide = num1 / num2;
            Assertions.assertEquals(divide, calculatorService.divide(num1, num2));
        }
    @ParameterizedTest
    @CsvSource({
            " , 5",
            " 5 , ",
            "  , ",
    })
    void testMethodDivideThrowsException(Integer num1, Integer num2) {
        assertThrows(NotFoundException.class, () -> {calculatorService.divide(num1, num2);});
    }
    @ParameterizedTest
    @CsvSource({
            " 5, 0",
    })
    void testMethodDivideThrowsExceptionOnZero(Integer num1, Integer num2) {
        assertThrows(NotValidationArgumentException.class, () -> {calculatorService.divide(num1, num2);});
    }
    }
