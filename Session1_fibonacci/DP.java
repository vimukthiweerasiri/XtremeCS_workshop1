import java.util.HashMap;

/**
 * Created by vimukthi on 6/24/15.
 */
public class DP {

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    public int fib (int n) {
        if (n <= 1) return n;

        int x, y;
        if(map.containsKey(n-1)) {
            x = map.get(n-1);
        } else {
            x = fib(n-1);
            map.put(n-1, x);
        }

        if(map.containsKey(n-2)) {
            y = map.get(n-2);
        } else {
            y = fib(n-2);
            map.put(n-2, y);
        }

        return x + y;
    }
}
