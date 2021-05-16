import java.util.Scanner;

public class MinMaxArray {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        FindMinMax(printArray(5));
    }

    public static int[] printArray(int count){


        int[] array = new int[count];
        System.out.println("Enter a Number: \r");
        for(int i =0; i<array.length; i++){
            array[i] += scanner.nextInt();
        }
        return array;
    }

    public static void FindMinMax(int[] array){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<array.length; i++){
            int value = array[i];
            if(value<min){
                min=value;
            }
            else if(value>max){
                max=value;
            }
        }
        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);

    }
}
