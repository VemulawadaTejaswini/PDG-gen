import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c=(char)(((int)s.charAt(0))+1);
        String ans=""+c+c+c;
        System.out.println(ans);
     }
}