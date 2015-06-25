/**
 * Created by vimukthi on 6/24/15.
 */
public class Power {
    public int pow (int n, int p) {
        int result = 1;
        while ( p > 0) {
            if (p % 2 == 1) {
                result *= n;
            }
            p /= 2;
            result *= n;
        }
        return result;
    }
}
