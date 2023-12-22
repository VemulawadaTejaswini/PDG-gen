import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N1 = sc.nextInt();
   int N2 = sc.nextInt();
   int N3 = sc.nextInt();
   
   if(N1+N2+N3 >=22)System.out.println("bust");
   else System.out.println("win");
 }
}