import java.util.*;
import java.util.Arrays;
public class Main{
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int d = sc.nextInt();
       int first = 1;
       int last = n;
       int count = 0;
       while(true){
           if(last-first<=1){
               count++;
               break;
           }
           first += 2*d;
           last -= 2*d;
           count++;
       }
       System.out.println(count);
    }
   
    
       
    
}