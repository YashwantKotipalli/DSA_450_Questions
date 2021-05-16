import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        reverse(printArray(5));

    }

    public static int[] printArray(int count){

        int[] array = new int[count];
        for(int i=0; i< array.length; i++){
            System.out.println("Enter a Number: \r");
            array[i] += scanner.nextInt();
        }
        System.out.println("regular array: " + Arrays.toString(array));
        return array;
    }

    public static int[] reverse(int[] array){

        int maxIndex = array.length-1;
        int halfIndex = array.length /2;
        int temp;
        for(int i=0; i<halfIndex; i++){
            temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i]=temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(array));
        return array;
    }
}
