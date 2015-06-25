public class Main {

    public static void main(String[] args) {

        int N = 1000000;

        Linear linear = new Linear();
        Recursion recursion = new Recursion();
        DP dp = new DP();
        Matrix matrix = new Matrix();

        long previous = System.currentTimeMillis();

        /* uncomment one of following lines to  benchmark each */

//        System.out.println(recursion.fib(1000000));
//        System.out.println(dp.fib(1000000));
//        System.out.println(matrix.fib(1000000));
//        System.out.println(linear.fib(1000000));

        System.out.println("execution time " + (System.currentTimeMillis() - previous));
    }
}
