import java.util.*;
public class Main {
       public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String s = sc.next();
         //Aが現れるのは何文字目？
         int a;
         for (a=0;a<s.length();a++) {
           if(s.charAt(a)=='A'){
             break;
           }
         }
         //Zが現れるのは何文字目？
         int z;
         for (z=s.length()-1;z>0;z--){
           if(s.charAt(z)=='Z'){
             break;
           }
         }
         System.out.println(z-a+1);
    }
}