import java.util.Scanner;

public class CountOccurencesArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Implemented using linear search method");
        System.out.println("Should use a good search algorithms to improve the efficiency");
        System.out.println(CountOccurences(2,printArray(5)));
    }

    public static int[] printArray(int count){

        int[] array = new int[count];
        System.out.println("Enter a Number: \r");
        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int CountOccurences(int n, int[] array){
        int count =0;

            for(int element : array){
                if(element ==n){

                    count++;
                }

            }

        return count;
    }
}
