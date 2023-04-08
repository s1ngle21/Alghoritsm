import java.util.Arrays;
import java.util.Objects;


public class InsertionSort {
    public static void main(String[] args) {
        int[] ints = ArrayUtils.getInts(5);
        System.out.println("Array before sorting" + Arrays.toString(ints));

        int[] sortedArr = insertionSort(ints);
        System.out.println("Sorted array" + Arrays.toString(sortedArr));
    }


    public static int[] insertionSort(int[] numbers) {
        Objects.requireNonNull(numbers);
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i - 1;

            while (j>= 0 && numbers[j] > current) {
                numbers [j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = current;
        }
        return numbers;
    }
}
