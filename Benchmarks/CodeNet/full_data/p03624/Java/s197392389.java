import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] s = S.split("");
        int base = 97;
        boolean[] boo = new boolean[26];
        for(int i=0; i<s.length; i++) {
            char x = S.charAt(i);
            boo[x-base] = true;
        }
        
        for(int i=0; i<26; i++) {
            if(boo[i]) {
                if(i == 25) {
                    System.out.println("None");
                }
                continue;
            }else {
                System.out.println((char)(base+i));
                break;
            }
            
        }
    }
}