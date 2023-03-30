import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class BubbleSort {

    public static void main(String[] args) {
        int[] ints = getInts(5);
        System.out.println("Array before sorting: " + Arrays.toString(ints));
        int[] sortedInts = sortArray(ints);
        System.out.println("Sorted array " + Arrays.toString(sortedInts));
    }

    private static int[] getInts(int size) {
        int[] ints = new int[size];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = ThreadLocalRandom.current().nextInt(size);
        }
        return ints;
    }

    private static int[] sortArray(int[] numbers) {
        Objects.requireNonNull(numbers);
        int l = numbers.length;
        int temp;
        for (int i = 0; i < l; i++) {
            for (int j = 1; j < l - i; j++) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}
