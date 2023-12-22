import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{

     public static void main(String []args) throws Exception {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        String s = inp.readLine().trim();
        int len = s.length();
        if(len==0 || len>6){
            System.out.println("No");
        }else{
            if(s.charAt(2) == s.charAt(3)  && s.charAt(4)==s.charAt(5)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        
        
     }
}