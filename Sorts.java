import java.util.Arrays;
public class Sorts{
    /**Bubble sort of an int array.
     *@postcondition The array will be modified such that the elements will be in increasing order.
     *@param data  the elements to be sorted.
     */
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
}
