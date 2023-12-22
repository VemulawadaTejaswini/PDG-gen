import java.util.*;
public class Main {
    public static void main(String [] args){
     Scanner sc  = new Scanner(System.in);
     String S = sc.next();
     int opt = 10000000;
     int n=753;
     for(int a=0;a<S.length()-2;a++){
         String num = S.substring(a,a+3);
         int num2 = Integer.parseInt(num);
         System.out.println("753-"+num2+"="+Math.abs(753-num2));
         if(Math.abs(n-num2)<=opt) opt =Math.abs(n-num2);
     }
        System.out.println(opt);
    }
}
