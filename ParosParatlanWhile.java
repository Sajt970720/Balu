import java.util.Scanner;

public class ParosParatlanWhile{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double szam1 = 1;
        
        while(szam1 > 0){
            System.out.println("Kérem adjon egy számot");
            szam1 = scanner.nextDouble(); 
            if(szam1 % 2 ==0){
                System.out.println("A szám páros");
            }else{
                System.out.println("A szám páratlan");
            }

        }


      }
}