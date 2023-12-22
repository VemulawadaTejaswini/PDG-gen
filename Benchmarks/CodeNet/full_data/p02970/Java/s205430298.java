import java.util.*;
import java.util.Arrays;
public class Main{
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int d = sc.nextInt();
       int count =1;
       int a = 2*d+1;
       while(a<=n){
           count++;
           a += a;
       }
       System.out.println(count);
    }
   
    
       
    
}