import java.util.Arrays;
import java.util.Objects;


public class BubbleSort {

    public static void main(String[] args) {
        int[] ints = ArrayUtils.getInts(5);
        System.out.println("Array before sorting: " + Arrays.toString(ints));
        int[] sortedInts = bubbleSort(ints);
        System.out.println("Sorted array " + Arrays.toString(sortedInts));
    }

    private static int[] bubbleSort(int[] numbers) {
        Objects.requireNonNull(numbers);
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
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
