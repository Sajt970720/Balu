import java.util.Scanner;

public class PyramidExaple{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        System.out.println("Kérem adjon meg egy számot: ");
        int szam= scanner.nextInt();

        int db =1;
        for(int i = 1; i <= szam ;i++){
            
            for(int j = 1 ; j <= db; j++){
                System.out.print("*");
            }
            System.out.println("");
            db++;
        }


      }
}