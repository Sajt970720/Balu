import java.util.Scanner;

public class Szogek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy szöget: ");
        int szog= scanner.nextInt();


        switch(szog)
        {
            case 0: System.out.println("0 szög");
                break;
            case 90: System.out.println("Derékszög");
                break;
            case 180: System.out.println("Egyenesszög:");
                break;
            case 360: System.out.println("Teljes szög");
                break;
            default: 
                szog = szog % 360;
                if(szog>0 && szog <90){
                    System.out.println("Hegyesszög");
                }else if(szog >90 && szog<180){
                    System.out.println("Tompaszög:");
                }else if(szog>180){
                    System.out.println("homorúszögek");
                }     
        }
        
        



    }
}
