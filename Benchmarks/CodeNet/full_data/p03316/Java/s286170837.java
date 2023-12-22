import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        
        int digit = 0;
        
        int numberin = number.length();
        
        int l = Integer.valueOf(number);
        for(int i = 0 ; i < numberin ; i++){
            digit = digit + Integer.valueOf(number.substring(i , i + 1));
        }
        
        int ans = l % digit;
        
        if(ans != 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}