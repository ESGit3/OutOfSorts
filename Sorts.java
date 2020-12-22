import java.util.Arrays;
public class Sorts{
    public static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length - 2; i++) {
            int numOfSwaps = 0;
            for (int j = 0; j < data.length - 1; j++) {
                int curr = data[j];
                if (curr > data[j+1]) {
                    data[j] = data[j+1];
                    data[j+1] = curr;
                    numOfSwaps++;
                }
            }
            if (numOfSwaps == 0) {
                break;
            }
        }
    }

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }

    public static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j -= 1;
            }
            data[j + 1] = temp;
        }
    }
}
