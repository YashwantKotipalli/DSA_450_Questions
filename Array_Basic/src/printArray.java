import java.util.Arrays;
import java.util.Scanner;

public class printArray {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Enter a Number: \r");
        printArray(10);



    }

    public static void printArray(int count){

        int[] array = new int[count];
        for(int i=0; i<array.length; i++){
            array[i] += scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));



    }
}
