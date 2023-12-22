import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String A = sc.next();
   int s = 0;
   
   for(int i =0;i<4;i++)
   {
     if(A.charAt(0)=='+') s++;
     else s--;
   }
   
   System.out.println(s);
 }
}