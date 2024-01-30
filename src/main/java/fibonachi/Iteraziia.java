package fibonachi;

public class Iteraziia {

    public static int fiboIterative(int n) {
        int a = 0, b = 1, c = 1;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
// Просторова складність: O(1) - не потрібно додаткового простору
// Часова складність: O(n) - необхідно пройти по циклу n разів для обчислення n-го числа Фібоначчі

}
