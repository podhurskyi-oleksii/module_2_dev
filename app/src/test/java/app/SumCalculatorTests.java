package app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Напиши тестовий клас для SumCalculator, де протестуй наступну поведінку методу sum() (кожний пункт списку - окремий тест):
 *
 * виклик sum(1) повертає 1
 * виклик sum(3) повертає 6
 * виклик sum(0) викидає виключення IllegalArgumentException
 * Використай метод з анотацією @BeforeEach, щоб конструювати об'єкт класу SumCalculator перед кожним тестом.
 */
public class SumCalculatorTests {

    private SumCalculator sum;

    @BeforeEach
    public void beforeEach() {
        sum = new SumCalculator();
    }
    @Test
    public void testThatSumWorksCorrect1() {
        int actual = sum.sum(1);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testThatSumWorksCorrect3() {
        int actual = sum.sum(3);
        Assertions.assertEquals(6, actual);
    }

    @Test
    public void testThatSumWorksCorrect0() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> sum.sum(0));
    }
}
