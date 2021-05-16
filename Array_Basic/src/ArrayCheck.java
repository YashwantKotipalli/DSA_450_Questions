import java.util.Scanner;

public class ArrayCheck {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        NumberExists(3,5);
    }

    public static void NumberExists(int number, int count){
        int[] array = new int[count];
        System.out.println("Enter a Number: \r");
        for(int i=0; i<array.length; i++){
            array[i] += scanner.nextInt();
        }
        for(int i=0; i<array.length-1; i++){
            if(array[i] == number){
                System.out.println("True");
            }

        }
        System.out.println("false");




    }
}
