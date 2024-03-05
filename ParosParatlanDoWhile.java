import java.util.Scanner;

public class ParosParatlanDoWhile{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double szam1= 0;


        do{
            System.out.println("Kérem adjon egy számot");
            szam1 = scanner.nextDouble(); 

            if(szam1 % 2 ==0){
                System.out.println("A szám páros");
            }else{
                System.out.println("A szám páratlan");
            }
        }while(szam1<0);



      }
}