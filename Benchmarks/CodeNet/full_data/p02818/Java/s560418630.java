import java.util.*;
public class Main { 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String o="";
       long a=sc.nextLong();
       long b=sc.nextLong();
      long k=sc.nextLong();     
      k=k-a;
      a=Math.max(-k,0);     
     if(k>0) b=Math.max(b-k,0);      
      o=Long.toString(a,10)+" "+Long.toString(b,10);
      System.out.println(o);
    }
}