import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   boolean flg = false;
   for(int i = 1;i<=9;i++){
     for(int k = 1;k<=9;k++){
       if(A == i*k) {
         flg =true;
         break;
       }
     }
     if(flg) break;
   }
   if(flg)System.out.println("Yes");
   else System.out.println("No");
 }
}