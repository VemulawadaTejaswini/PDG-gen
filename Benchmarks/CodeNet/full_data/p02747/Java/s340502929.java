import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        if (s.length()==1){
            System.out.println("No");
        }else if (s.length()==2){
            if (s.charAt(0)=='h' && s.charAt(1) == 'i'){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }else {
            for (int i = 0; i < s.length()-3; i++) {
                if (s.charAt(i)=='h' && s.charAt(i+1) == 'i'){
                    if(s.charAt(i+2) == 'i'){
                        continue;
                    }else {
                        System.out.println("Yes");
                    }
                }
            }
            if(s.charAt(s.length()-2)=='h' && s.charAt((s.length()-1))=='i'){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }
        
        
    }
}
