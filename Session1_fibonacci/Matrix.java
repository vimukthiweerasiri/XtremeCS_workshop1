/**
 * Created by vimukthi on 6/24/15.
 */

public class Matrix {

    public int fib(int n) {

        if (n <= 1) return n;

        int[][] result = {
                {1, 0},
                {0, 1}};

        int[][] fiboM = {
                {1, 1},
                {1, 0}};

        while (n > 0) {
            if (n%2 == 1) {
                result = multMatrix(result, fiboM);
            }
            n = n / 2;
            fiboM = multMatrix(fiboM, fiboM);
        }

        return result[1][0];
    }

    private int[][] multMatrix(int[][] m, int [][] n) {
        int a = m[0][0] * n[0][0] +  m[0][1] * n[1][0];
        int b = m[0][0] * n[0][1] +  m[0][1] * n[1][1];
        int c = m[1][0] * n[0][0] +  m[1][1] * n[0][1];
        int d = m[1][0] * n[0][1] +  m[1][1] * n[1][1];
        int[][] ret = {
                {a, b},
                {c, d}};
        return ret;
    }
}
