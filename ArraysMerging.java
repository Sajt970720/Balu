import java.util.Scanner;

public class ArraysMerging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        int[] arr2 = { 10, 324, 45, 90, 9808 };

        int uj_tomb_hossz = arr1.length+arr2.length;

        int[] arr3 = new int[uj_tomb_hossz];
        
        
        for(int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i]; 
        }

        for(int i = 0 ; i<arr2.length ; i++){
            arr3[i+arr1.length]= arr2[i];
        }

        for(int i = 0 ; i<arr3.length ; i++){
            System.out.println("arr3: " + arr3[i]);
        }

    }
}