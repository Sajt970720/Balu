import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("A tömbök száma:");
        int tombok_szama = scanner.nextInt();
        System.out.println("A tömbök hossza:");
        int tombok_hossza = scanner.nextInt();
        
        int[][] tomb = new int[tombok_szama][tombok_hossza]; 

        for(int i = 0;i<tombok_szama;i++){

            for(int j = 0  ; j < tombok_hossza; j++){
                System.out.print("Kérem adjon egy egész számot: ");
                tomb[i][j] = scanner.nextInt(); 
            }
        }

        
        for(int i = 0;i<tombok_szama;i++){

            for(int j = 0  ; j < tombok_hossza; j++){
                System.out.print(tomb[i][j] + " ");
               
            }
            System.out.println("");
        }
    }
}
