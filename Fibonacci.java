public class Fibonacci {
/**
Return the nth term of the Fibonacci sequence using recursion
@param n the position in the Fibonacci method is greater than 0
@return the nth Fibonacci number
*/
    public static long fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        long y = fib(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + y + ".");
    }
}
