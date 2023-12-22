import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        if(s.length != t.length) {
            System.out.println("No");
            return;
        }
        int len = s.length;
        ArrayList<Character> sl = new ArrayList<Character>();
        for(char c : s){
            sl.add(c);
        }
        for(int i = 0; i < len; i++){
            boolean bool = true;
            for(int j = 0; j < len; j++){
                if(sl.get(j) != t[j]){
                    bool = false;
                    break;
                }
            }
            if(bool){
                System.out.println("Yes");
                return;
            }
            Collections.rotate(sl,1);
        }
        System.out.println("No");
    }
}