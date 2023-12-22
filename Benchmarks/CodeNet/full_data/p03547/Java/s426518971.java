import java.util.*;

public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String a;
        a = sc.next();
        String b = a.substring(0,1);
        String c = a.substring(1,2);
        
        int d = Integer.valueOf(b,16);
        int e = Integer.valueOf(c,16);
        
        if(d>e) {
            System.out.println(">");
        }
        else if(d<e) {
            System.out.println("<");
        }
        else {
            System.out.println("=");
        }
     }
}