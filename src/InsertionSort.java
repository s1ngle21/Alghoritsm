import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ints = getInts(5);
        System.out.println("Array before sorting" + Arrays.toString(ints));

        int[] sortedArr = insertionSort(ints);
        System.out.println("Sorted array" + Arrays.toString(sortedArr));
    }

    public static int[] getInts(int size) {
        int[] ints = new int[size];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = ThreadLocalRandom.current().nextInt(size);
        }
        return ints;
    }

    public static int[] insertionSort(int[] numbers) {
        Objects.requireNonNull(numbers);
        int l = numbers.length;
        for (int i = 1; i < l; i++) {
            int temp = numbers[i];
            int j = i - 1;

            while (j>= 0 && numbers[j] > temp) {
                numbers [j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = temp;
        }
        return numbers;
    }
}
