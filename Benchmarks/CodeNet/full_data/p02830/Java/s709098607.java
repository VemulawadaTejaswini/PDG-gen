import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        String s = scan.next();
        String t = scan.next();
        
        String[] newS = s.split("");
        String[] newT = t.split("");
        
        String text = "";
        for (int i=0; i<len; i++) {
            text += (newS[i] + newT[i]);
        }
        System.out.println(text);
    }
}
