import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int a_counter = 0;
        int b_counter = 0;
        
        
        for(int i = 0; i < 3; ++i) {
            char c = str.charAt(i);
            if(c == 'A') ++a_counter;
            else ++b_counter;
        }
        
        if((a_counter > 0) && (b_counter >0)) System.out.println("Yes");
        else System.out.println("No");
    }
}