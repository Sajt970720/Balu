import java.util.Scanner;

public class Dolgozat4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kérek egy számot 1 és 10 között: ");
        int szam = scanner.nextInt();
        if(szam >1 && szam <10){
            switch(szam){
                case 2: 
                    System.out.println("A szám prím:");
                    break;  
                case 3: 
                    System.out.println("A szám prím:");
                    break;      
                case 5: 
                    System.out.println("A szám prím:");
                    break;
                case 7: 
                    System.out.println("A szám prím:");
                    break;
                default:
                    if(szam % 2 == 0){
                        System.out.println("A szám osztható 2 vel");
                    }
                    if(szam % 3 == 0){
                        System.out.println("A szám osztható 3 al");
                    }
                    if(szam % 4 == 0){
                        System.out.println("A szám osztható 4 el");
                    }
                    if(szam % 5 == 0){
                        System.out.println("A szám osztható 5 el");
                    }
                    if(szam % 6 == 0){
                        System.out.println("A szám osztható 6 al");
                    }
                    if(szam % 7 == 0){
                        System.out.println("A szám osztható 7 el");
                    }
                    if(szam % 8 == 0){
                        System.out.println("A szám osztható 8 al");
                    }
                    if(szam % 9 == 0){
                        System.out.println("A szám osztható 9 el");
                    }

                    
                    
            }

        }else{
            System.out.print("A szám téves.");
        }





    }
}