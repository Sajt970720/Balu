import java.util.Scanner;

public class ArrayMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };

        int maximum = 0;
        for(int i = 0; i<arr.length;i++)
        {
            if(maximum < arr[i]){
                maximum = arr[i];
            }
        }
        System.out.println("A legnagyobb szám az arr tömben: " + maximum);




    }
}