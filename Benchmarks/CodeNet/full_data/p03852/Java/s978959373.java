
import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char a = (char) sc.next();
        String judbe = "consonant";
        if(a == 'a' || a == 'i' || a == 'u' || a == 'e' || a == 'o'){
            judge = "vowel";
        }
        System.out.println(judge);
    }
}