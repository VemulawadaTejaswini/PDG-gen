import java.util.*;
import java.util.Comparator;

public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long o1=0;
        long o2=0;
        String s=sc.next();
        String t=sc.next();
        o1=sc.nextLong();
        o2=sc.nextLong();
        String u=sc.next();
        if(s.equals(u)){
        	o1--;
        }else{
        	o2--;
        }
        
      
      System.out.println(o1+" "+o2);
    }
}