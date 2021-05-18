import java.util.Arrays;
import java.util.Scanner;

public class MoveNegatives{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Arrays sorted: " + Arrays.toString(moveNegatives(5,printArray(5))));
    }

    public static int[] printArray(int count){

        int[] array = new int[count];
        System.out.println("Enter a Number: \r");
        for(int i=0; i<array.length; i++){
            array[i]+=scanner.nextInt();
        }
        return array;
    }

    public static int[] moveNegatives(int size, int[] array){

        int j=0;
        int temp=0;

        for(int i=0; i<array.length; i++){
            if(array[i]<0){
                if(i!=j){
                    temp =array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
        }
        return array;

    }
}