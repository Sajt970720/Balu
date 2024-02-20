import java.util.Random;
import java.util.Scanner;

public class Matek{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int randomNum = (int)(Math.random() * 200+1);
        int randomNum2 = (int)(Math.random() * 200+1);

        System.out.println("A két szám lözül a nagyobb: "+ Math.max(randomNum, randomNum2) );
        System.out.println("A két szám lözül a kisebb: "+ Math.min(randomNum, randomNum2) );
        System.out.println("Az első szám négyzetgyöke: " + Math.sqrt(randomNum));
        System.out.println("A második szám négyzetgyöke: " + Math.sqrt(randomNum2));
        int tavolsag= randomNum - randomNum2;
        System.out.println("A két szám közötti távolság:"+Math.abs(tavolsag));
        System.out.println("Az első szám köbe: "+Math.pow(randomNum,3));
        System.out.println("A második szám köbe: "+Math.pow(randomNum2,3));
        double hanyados = randomNum/(double)randomNum2 ;
        System.out.println("A két szám hányadosa legközelebi egészre kerekítése: "+ hanyados);
        System.out.println("A két szám hányadosa legközelebi egészre kerekítése: "+ Math.round(hanyados));
        System.out.println("A két szám hányadosa lefele kerekítve: "+ Math.floor(hanyados));
        System.out.println("A két szám hányadosa felfele kerekítve: "+ Math.ceil(hanyados));

        
        

    }
}