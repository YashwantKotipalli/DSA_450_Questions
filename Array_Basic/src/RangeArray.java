import java.util.Scanner;

public class RangeArray {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Range of the input array is: " + findRange(printArray(5)));

    }

    public static int[] printArray(int count){
        int[] array = new int[count];
        System.out.println("Enter a Number: \r");
        for(int i=0; i<array.length; i++){
            array[i] += scanner.nextInt();
        }

        return array;
    }


    public static int findRange(int[] array){

        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;

        for(int i=0; i<array.length; i++){

            int value = array[i];

            if(value<Min){
                Min = value;
            }
            else if(value>Max){
                Max = value;
            }

        }
        return Max-Min;
    }
}
