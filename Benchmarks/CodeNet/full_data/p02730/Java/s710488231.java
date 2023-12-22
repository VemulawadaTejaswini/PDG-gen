import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] cl = s.toCharArray();
        int len = cl.length;
        for(int i = 0; i < len/2; i++){
            if(cl[i] != cl[len-1-i]){
                System.out.println("No");
                return;
            }
        }
        char[] cl2 = s.substring(0,s.length()/2).toCharArray();
        len = cl2.length;
        for(int i = 0; i < len/2; i++){
            if(cl2[i] != cl2[len-1-i]){
                System.out.println("No");
                return;
            }
        }
        char[] cl3 = s.substring((s.length()+2)/2,s.length()).toCharArray();
        len = cl3.length;
        for(int i = 0; i < len/2; i++){
            if(cl3[i] != cl3[len-1-i]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}