import java.util.Arrays;
import java.util.Scanner;

public class Array012 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        int[] array = {0,1,1,1,1,2,2,0,1,1,0,0,0,2,2,0};
        int size = array.length;
        sort(size,array);
        System.out.println("Array after segreagation; " + Arrays.toString(printArray(size,array)));


    }

    public static int[] printArray(int size, int[] array){

        int i;

        for(i=0; i<array.length; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println("");
        return array;
    }

    public static void sort(int size, int[] array){

        int low = 0;
        int hi = size-1;
        int mid = 0, temp=0;

        while(mid<=hi){
            switch(array[mid]){
                case 0: {
                    temp =array[low];
                    array[low] = array[mid];
                    array[mid] = temp;
                    low++;
                    mid++;
                    break;
                }

                case 1:
                    mid++;
                    break;

                case 2:
                    temp=array[mid];
                    array[mid] = array[hi];
                    array[hi] = temp;
                    hi--;
                    break;
            }
        }

    }
}
