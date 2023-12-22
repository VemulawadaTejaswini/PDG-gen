import java.util.Scanner;
import java.lang.Character;

public class Main {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            String res = "";
            char ch;            

            for (int i = 0; i < n; i++) {
                if (i == k - 1) {
                    ch = Character.toLowerCase(s.charAt(i));                
                }            
                else {
                    ch = s.charAt(i);
                }
                res += "" + ch;
            }
            System.out.println(res);
        }           
    }
}