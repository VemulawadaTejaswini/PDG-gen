import java.util.*;
 
public class Main{
 
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        check(n);
     }
     
     public static void check(String n){
         String[] s = n.split("");
         int a = Integer.parseInt(s[0]);
         int b = Integer.parseInt(s[1]);
         int c = Integer.parseInt(s[2]);
         int d = Integer.parseInt(s[3]);
         if (a+b+c+d==7){
              System.out.println(a+"+"+b+"+"+c+"+"+d+"="+7);
         }else if (a+b+c-d==7){
              System.out.println(a+"+"+b+"+"+c+"-"+d+"="+7);
         }else if (a+b-c+d==7){
              System.out.println(a+"+"+b+"-"+c+"+"+d+"="+7);
         }else if (a+b-c-d==7){
              System.out.println(a+"+"+b+"-"+c+"-"+d+"="+7);
         }else if (a-b+c+d==7){
              System.out.println(a+"-"+b+"+"+c+"+"+d+"="+7);
         }else if (a-b+c-d==7){
              System.out.println(a+"-"+b+"+"+c+"-"+d+"="+7);
         }else if (a-b-c+d==7){
              System.out.println(a+"-"+b+"-"+c+"+"+d+"="+7);
         }else if (a-b-c-d==7){
              System.out.println(a+"-"+b+"-"+c+"-"+d+"="+7);
         }
     }
}