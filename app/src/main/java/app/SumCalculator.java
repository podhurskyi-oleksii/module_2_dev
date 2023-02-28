package app;

/**
 * Напиши тестовий клас для SumCalculator, де протестуй наступну поведінку методу sum() (кожний пункт списку - окремий тест):
 *
 * виклик sum(1) повертає 1
 * виклик sum(3) повертає 6
 * виклик sum(0) викидає виключення IllegalArgumentException
 * Використай метод з анотацією @BeforeEach, щоб конструювати об'єкт класу SumCalculator перед кожним тестом.
 */
public class SumCalculator {
    public int sum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Argument " + n + "negative!");
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }
}

