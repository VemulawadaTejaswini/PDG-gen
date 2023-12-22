import java.io.*;
import java.util.*;
import java.math.*;
public class Main{

     public static void main(String []args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String line1 = br.readLine();
        String[] strs = line1.trim().split("\\s+");
        int x = Integer.parseInt(strs[0]);
        int a = Integer.parseInt(strs[1]);
        
        if(x<a) System.out.println(0);
        else System.out.println(10);
   
}  

}



