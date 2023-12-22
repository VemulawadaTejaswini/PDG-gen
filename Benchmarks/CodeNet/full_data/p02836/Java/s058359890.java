import java.util.*;

class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int counter = 0;
        
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) != s.charAt(s.length() - i -1)) ++counter;
            else continue;
        }
        
        System.out.println(counter / 2);
    }
}