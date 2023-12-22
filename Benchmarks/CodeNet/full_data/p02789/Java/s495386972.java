import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int H = sc.nextInt();
   int W = sc.nextInt();

 
   String ans ="Yes";

   if(H!=W) ans = "No"; 
   System.out.println(ans);
 }
}