import java.util.Scanner;

public class Tomb1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kérem adja meg mennyi számot szeretne megadni: ");
        int szamok = scanner.nextInt();
        
        int[] tomb = new int[szamok];

        for(int i = 0; i<tomb.length ; i++){
            System.out.println("Kérem adja meg egy számot: ");
            int szam = scanner.nextInt();
            tomb[i] = szam;
        }

        for(int i = 0 ;i< tomb.length ; i++){
            System.out.println("A tömb " + i + " eleme: " + tomb[i]);
        }



    }
}
