import java.util.Scanner;

public class Dolgozat3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kérek egy számot 10 és 90 között(saját magukat is beleértve): ");
        int szam = scanner.nextInt();

        /*Ha a szám helyeg és osztható 3-mal, akkor Írask ki, hogy Fizz.
          Ha a szám helyeg és osztható 5-tel, akkor Írask ki, hogy Buzz.
        Ha a szám helyeg és osztható 3-mal és 5-tel, akkor Írask ki, hogy FizzBuzz.
        Ha a szám helyeg és nem osztható sem 3-mal és sem 5-tel, akkor Írask ki a számot. */
        if(szam >= 10 && szam <= 90){
            if(szam%3 == 0 && szam % 5 == 0){ 
                System.out.println("FizzBuzz");
            }else if(szam % 5 == 0){
                System.out.println("Buzz");
            }else if(szam % 3 == 0){
                System.out.println("Fizz");
            }else{
                System.out.println(szam);
            }
        }else{
            System.out.println("A szám nem helyes.");
        }
 
        




    }
}