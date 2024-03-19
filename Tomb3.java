import java.util.Scanner;

public class Tomb3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Kérem adja meg mennyi szövehet szeretne megadni: ");
        int szamok = scanner.nextInt();
        
        String[] tomb = new String[szamok];

        for(int i = 0; i<tomb.length ; i++){
            System.out.println("Kérem adja meg egy szöveget: ");
            String szoveg = scanner.next();
            tomb[i] = szoveg;
        }

        for(int i = 0 ;i< tomb.length ; i++){
            System.out.println("A tömb " + i + " eleme: " + tomb[i]);
        }





    }
}
