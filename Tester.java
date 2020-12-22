import java.util.*;

public class Tester {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random rng = new Random();
        for(int i =  0; i < 15; i++){
            arr[i] = rng.nextInt() % 1000;
        }
        System.out.println(Arrays.toString(arr));
        Sorts.insertionSort(arr);
        System.out.println(Arrays.toString(arr));


        int[] arr2 = new int[]{1, 3, 4, 5, 8, 9, 11, 22, 34};
        System.out.println(Arrays.toString(arr2));
        Sorts.selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}