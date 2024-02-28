import java.util.Scanner;

public class Dolgozat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kérem a kőr sugarát: ");
        int kor = scanner.nextInt();

        //r negyzet.* 3.14
        System.out.println("A kör területe: " + Math.sqrt(kor) *3.14);
        System.out.println("A kör területe egész számra kerekítve: " + Math.round(kor));

    




    }
}