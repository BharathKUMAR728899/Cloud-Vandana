// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Random;

public class Shuffling{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Random rand = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
}

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
}
    }

