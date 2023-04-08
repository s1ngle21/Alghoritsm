import java.util.concurrent.ThreadLocalRandom;

public class ArrayUtils {

    private ArrayUtils() {

    }

    public static int[] getInts(int size) {
        int[] ints = new int[size];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = ThreadLocalRandom.current().nextInt(size);
        }
        return ints;
    }
}
