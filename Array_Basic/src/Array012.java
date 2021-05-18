import java.util.Arrays;
import java.util.Scanner;

public class Array012{


    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        int[] array = {0,1,2,2,2,1,0,0,0,1,1,1,1,0,2,2};
        System.out.println("Sorted array : " + Arrays.toString(sort(16,array)));

    }

    public static int[] sort(int size, int[] array){

        int temp=0;
        int low =0;
        int mid=0;
        int hi = size-1;

        while(mid<=hi){
            switch(array[mid]){
                case 0:
                    temp = array[low];
                    array[low] = array[mid];
                    array[mid] = temp;
                    mid++;
                    low++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    temp = array[mid];
                    array[mid] = array[hi];
                    array[hi] = temp;
                    hi--;
                    break;
            }
        }
        return array;
    }



}