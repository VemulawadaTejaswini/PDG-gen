

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        new Main().q1();
    }
    
    
    public void q1() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String ret = "";
        for (int i = 0; i < a.length(); i++) {
            ret += a.charAt(i);
            if(i < b.length()) {
                ret += b.charAt(i);
            }
            
        }
        System.out.println(ret);
        
        
    }
    
    
}

