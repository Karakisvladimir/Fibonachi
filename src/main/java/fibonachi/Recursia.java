package fibonachi;

public class Recursia {
    public static int fiboRecursive(int n) {
        if (n <= 1)
            return n;
        return fiboRecursive(n-1) + fiboRecursive(n-2);
    }
// Просторова складність: O(n) - необхідно додатковий стек для зберігання рекурсивних викликів
// Часова складність: O(n^2) - необхідно викликати функцію n^2 разів для обчислення n-го числа Фібоначчі
}
