package fibonachi;

public class DinamicProgramuvannia {
    public static int fiboDynamic(int n) {
        int[] a = new int[n+2];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = a[i-1] + a[i-2];
        }
        return a[n];
    }
// Просторова складність: O(n) - необхідно додатковий масив для зберігання попередніх результатів
// Часова складність: O(n) - необхідно пройти по циклу n разів для обчислення n-го числа Фібоначчі
}


