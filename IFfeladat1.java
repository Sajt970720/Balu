import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class IFfeladat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 feladat
        System.out.println("kérek egy egész számot: ");
        int szam1 = scanner.nextInt();
        System.out.println("kérek egy másik egész számot: ");
        int szam2 = scanner.nextInt();

        if(szam1 > szam2){
            System.out.print("A két szám közűl az első a nagyobb");
        }else if(szam1 < szam2){
            System.out.print("A kétszám közűl a második a nagyobb");
        }else{
            System.out.println("A két szám egyenlő");
        }
        //2 feladat
        System.out.println("kérek a magaságát: ");
        int magassag = scanner.nextInt();
        if(magassag >= 150 && 165 > magassag){
            System.out.println("A mérete S");
        }else if (magassag >= 165 && 175 > magassag){
            System.out.println("A mérete M");
        }else if (magassag >= 175 && 185 > magassag){
            System.out.println("A mérete L");
        }else if (magassag >= 185 && 195 > magassag){
            System.out.println("A mérete XL");
        }else{
            System.out.println("NO SIZE");
        }
        //3 feladat
        System.out.println("kérek egy egész számot: ");
        int szam3 = scanner.nextInt();
        System.out.println("kérek egy másik egész számot: ");
        int szam4 = scanner.nextInt();
        System.out.println("kérek még egy egész számot: ");
        int szam5 = scanner.nextInt();
        //legnagyobb
        if(szam3 > szam4 && szam3>szam5){
            System.out.print("Az első a leggnagyobb");
        }else if(szam4 > szam3 && szam4>szam5){
            System.out.print("A második a leggnagyobb");
        }else if(szam5 > szam3 && szam5>szam4){
            System.out.println("A 3.szám a legnagyobb");
        }
        //közepes
        if((szam3 > szam4 && szam3<szam5) || (szam3 < szam4 && szam3>szam5)){
            System.out.print("Az első a középső");
        }else if((szam4 > szam3 && szam4<szam5) || (szam4 < szam3 && szam4>szam5)){
            System.out.print("A második a középső");
        }else if((szam5 > szam3 && szam5<szam4) || (szam5 < szam3 && szam5>szam4)){
            System.out.println("A 3.szám a középső");
        }
        //legkisebb
        if(szam3 < szam4 && szam3<szam5){
            System.out.print("Az első a legkisebb");
        }else if(szam4 < szam3 && szam4<szam5){
            System.out.print("A második a legkisebb");
        }else if(szam5 < szam3 && szam5<szam4){
            System.out.println("A 3.szám a legkisebb");
        }

    }
}
