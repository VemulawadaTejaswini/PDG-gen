import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        String ans = null;
        switch(s) {
            case 'A': ans = "T"; break;
            case 'T': ans = "A"; break;
            case 'C': ans = "G"; break;
            case 'G': ans = "C"; break;
        }

        System.out.println(ans);
        
    } 
}