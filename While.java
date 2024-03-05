import javax.swing.text.PasswordView;

import java.util.Random;
import java.util.Scanner;

public class While{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random = new Random();

        int szam1= (int)(Math.random() * 99 +1);
        int szam2= (int)(Math.random() * 99 +1);
        int szam3=szam1;
        int szam4=szam2;
        int kisebb = Math.min(szam1, szam2);
        int nagyobb = Math.max(szam2, szam1);
        int kisebb2 = Math.min(szam1, szam2);
        int nagyob2 = Math.max(szam2, szam1);
        int db = 0;
        System.out.println("A while megoldasresz:");
        while(kisebb<=nagyobb){
            if(db<9){
                if(kisebb==nagyobb){
                    //nemtortenik semmi
                }else{
                    System.out.print(kisebb+" ; ");
                }

            }
            else{
                if(kisebb==nagyobb){
                    //nemtortenik semmi
                }else{
                    System.out.println(kisebb);
                    db=-1;
                }
            }
            kisebb++;
            db++;
        }
        System.out.println("");
        System.out.println("A do while megoldasresz:");
        db=0;
        do{
            if(db<9){
                if(kisebb2==nagyobb){
                    //nemtortenik semmi
                }else{
                    System.out.print(kisebb2+" ; ");
                }

            }
            else{
                if(kisebb==nagyobb){
                    //nemtortenik semmi
                }else{
                    System.out.println(kisebb2);
                    db=-1;
                }
            }
            kisebb2++;
            db++;
        }while(kisebb2<=nagyob2);
      }
}