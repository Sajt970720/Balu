import java.util.Scanner;

public class HozzaAdA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String[] nevek = {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "piranh"};

        for(int i = 0 ; i < nevek.length ;i++)
        {
            String nev = nevek[i];
            nev = nevek[i]+"a";
            nevek[i] = nev;
        }
        for(int i = 0; i < nevek.length  ; i++){
            System.out.println("A tomb " + i + "dik eleme: " + nevek[i]);
        }



    }
}
