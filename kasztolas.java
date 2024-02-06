import java.util.Scanner;

public class kasztolas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        byte szam1= 12;
        short szam2 = 13;
        int szam3 = 14 ;
        long szam4 = 15L;

        float szam6 = 12.f;
        double szam7 =  23.65d;

        char betu = 'a';
        String szoveg = "Ez egy szoveg";

        boolean igaz = true;
        boolean hamis = false;

        System.out.println(szoveg);
        System.out.println(szam1);
        System.out.println(szam2);
        System.out.println(szam3);
        System.out.println(szam4);
        System.out.println(szam6);
        System.out.println(szam7);
        System.out.println(betu);
        System.out.println(igaz);
        System.out.println(hamis);

    
        float uj_float = (float) szam7;
        int uj_int = (int) szam4;
        char uj_char = (char) szam3;
        short uj_short = (short) szam1;

        System.out.println(uj_float);
        System.out.println(uj_int);
        System.out.println(uj_char);
        System.out.println(uj_short);
        
    }
}
