import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
       HashMap<Integer,String> hm = new HashMap<>();
       int n  = sc.nextInt();
       int m = sc.nextInt();
      int pen=0,correct=0;
       for(int i=0; i<m; i++){
           int  x = sc.nextInt();
           String s = sc.next();
           if(hm.containsKey(x)){
               String ver = hm.get(x);
               if(ver.equals("WA") && s.equals("WA"))
                     pen++;
               else if(ver.equals("WA") && s.equals("AC")){
                   hm.put(x,"AC");correct++;
               }
           }else{
               if(s.equals("AC"))
                   correct++;
               if(s.equals("WA"))
                   pen++;
               hm.put(x,s);
           }
       }
       System.out.println(correct+" "+pen);
    }
}