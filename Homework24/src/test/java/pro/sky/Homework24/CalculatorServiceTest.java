package pro.sky.Homework24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.Homework24.exception.NotFoundException;
import pro.sky.Homework24.exception.NotValidationArgumentException;
import pro.sky.Homework24.service.CalculatorService;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();
    @Test
    public void testMethodPlusOnPositiveParameters() {
        Integer num1 = 5;
        Integer num2 = 5;
        Integer sum = num1 + num2;
        Assertions.assertEquals(sum, calculatorService.plus(num1, num2));
    }
    @Test
    public void testMethodPlusOnNegativeParameters() {
        Integer num1 = -5;
        Integer num2 = -5;
        Integer sum = num1 + num2;
        Assertions.assertEquals(sum, calculatorService.plus(num1, num2));
    }

    @Test
    public void testMethodPlusOnAbsentParameterNum1() {
        boolean exceptionThrown=false;
        Integer num1 = null;
        Integer num2 = 5;
        try {
            calculatorService.plus(num1, num2);
        } catch (NotFoundException e) {
            exceptionThrown=true;
        }
        Assertions.assertTrue(exceptionThrown);
    }
    @Test
    public void testMethodPlusOnAbsentParameterNum2() {
        boolean exceptionThrown=false;
        Integer num1 = 5;
        Integer num2 = null;
        try {
            calculatorService.plus(num1, num2);
        } catch (NotFoundException e) {
            exceptionThrown=true;
        }
        Assertions.assertTrue(exceptionThrown);
    }
    @Test
    public void testMethodPlusOnAbsentParametersNum1Num2() {
        boolean exceptionThrown=false;
        Integer num1 = null;
        Integer num2 = null;
        try {
            calculatorService.plus(num1, num2);
        } catch (NotFoundException e) {
            exceptionThrown=true;
        }
        Assertions.assertTrue(exceptionThrown);
    }
   @Test
   public void testMethodMinusOnPositiveParameters() {
       Integer num1 = 5;
       Integer num2 = 5;
       Integer minus = num1 - num2;
       Assertions.assertEquals(minus, calculatorService.minus(num1, num2));
   }
    @Test
    public void testMethodMinusOnNegativeParameters() {
        Integer num1 = -5;
        Integer num2 = -5;
        Integer minus = num1 - num2;
        Assertions.assertEquals(minus, calculatorService.minus(num1, num2));
    }
    @Test
    public void testMethodMinusOnAbsentParameterNum1() {
        boolean exceptionThrown=false;
        Integer num1 = null;
        Integer num2 = 5;
        try {
            calculatorService.minus(num1, num2);
        } catch (NotFoundException e) {
            exceptionThrown=true;
        }
        Assertions.assertTrue(exceptionThrown);
    }
    @Test
    public void testMethodMinusOnAbsentParameterNum2() {
        boolean exceptionThrown=false;
        Integer num1 = 5;
        Integer num2 = null;
        try {
            calculatorService.minus(num1, num2);
        } catch (NotFoundException e) {
            exceptionThrown=true;
        }
        Assertions.assertTrue(exceptionThrown);
    }
    @Test
    public void testMethodMinusOnAbsentParametersNum1Num2() {
        boolean exceptionThrown=false;
        Integer num1 = null;
        Integer num2 = null;
        try {
            calculatorService.minus(num1, num2);
        } catch (NotFoundException e) {
            exceptionThrown=true;
        }
        Assertions.assertTrue(exceptionThrown);
    }
    @Test
    public void testMethodMultiplyOnPositiveParameters() {
        Integer num1 = 5;
        Integer num2 = 5;
        Integer multiply= num1 * num2;
        Assertions.assertEquals(multiply, calculatorService.multiply(num1, num2));
    }
    @Test
    public void testMethodMultiplyOnNegativeParameters() {
        Integer num1 = -5;
        Integer num2 = -5;
        Integer multiply= num1 * num2;
        Assertions.assertEquals(multiply, calculatorService.multiply(num1, num2));
    }
    @Test
    public void testMethodMultiplyOnAbsentParameterNum1() {
        boolean exceptionThrown=false;
        Integer num1 = null;
        Integer num2 = 5;
        try {
            calculatorService.multiply(num1, num2);
        } catch (NotFoundException e) {
            exceptionThrown=true;
        }
        Assertions.assertTrue(exceptionThrown);
    }
    @Test
    public void testMethodMultiplyOnAbsentParameterNum2() {
        boolean exceptionThrown=false;
        Integer num1 = 5;
        Integer num2 = null;
        try {
            calculatorService.multiply(num1, num2);
        } catch (NotFoundException e) {
            exceptionThrown=true;
        }
        Assertions.assertTrue(exceptionThrown);
    }
    @Test
    public void testMethodMultiplyOnAbsentParametersNum1Num2() {
        boolean exceptionThrown=false;
        Integer num1 = null;
        Integer num2 = null;
        try {
            calculatorService.multiply(num1, num2);
        } catch (NotFoundException e) {
            exceptionThrown=true;
        }
        Assertions.assertTrue(exceptionThrown);
    }

    @Test
    public void testMethodDivideOnPositiveParameters() {
        Integer num1 = 5;
        Integer num2 = 5;
        Integer divide = num1 / num2;
        Assertions.assertEquals(divide, calculatorService.divide(num1, num2));
    }
    @Test
    public void testMethodDivideOnNegativeParameters() {
        Integer num1 = -5;
        Integer num2 = -5;
        Integer divide = num1 / num2;
        Assertions.assertEquals(divide, calculatorService.divide(num1, num2));
    }
    @Test
    public void testMethodDivideOnAbsentParameterNum1() {
        boolean exceptionThrown=false;
        Integer num1 = null;
        Integer num2 = 5;
        try {
            calculatorService.divide(num1, num2);
        } catch (NotFoundException e) {
            exceptionThrown=true;
        }
        Assertions.assertTrue(exceptionThrown);
    }
    @Test
    public void testMethodDivideOnAbsentParameterNum2() {
        boolean exceptionThrown=false;
        Integer num1 = 5;
        Integer num2 = null;
        try {
            calculatorService.divide(num1, num2);
        } catch (NotFoundException e) {
            exceptionThrown=true;
        }
        Assertions.assertTrue(exceptionThrown);
    }
    @Test
    public void testMethodDivideOnAbsentParametersNum1Num2() {
        boolean exceptionThrown=false;
        Integer num1 = null;
        Integer num2 = null;
        try {
            calculatorService.divide(num1, num2);
        } catch (NotFoundException e) {
            exceptionThrown=true;
        }
        Assertions.assertTrue(exceptionThrown);
    }
    @Test
    public void testMethodDivideOnParameterNum2Zero() {
        boolean exceptionThrown=false;
        Integer num1 = 5;
        Integer num2 = 0;
        try {
            calculatorService.divide(num1, num2);
        } catch (NotValidationArgumentException e) {
            exceptionThrown=true;
        }
        Assertions.assertTrue(exceptionThrown);
    }
}
