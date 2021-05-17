import java.util.Arrays;
import java.util.Scanner;

public class SortArray{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Array : " + Arrays.toString(sortedArray(printArray(5))));

    }

    public static int[] printArray(int count){

        int[] array = new int[count];
        System.out.println("Enter a Number: \r");
        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;

    }

    public static int[] sortedArray(int[] array){

        int[] sortedArray = new int[array.length];
        for(int i=0; i<sortedArray.length; i++){
            sortedArray[i] = array[i];
        }
        int temp;

        for(int i=0; i<sortedArray.length;i++){
            for(int j=i; j<sortedArray.length; j++){
                if(sortedArray[i]>sortedArray[j]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;

    }

}