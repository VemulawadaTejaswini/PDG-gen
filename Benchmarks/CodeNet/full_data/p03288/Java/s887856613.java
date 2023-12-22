import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   
   if(A<1200) System.out.println("ABC");
   else if (A>=2800)System.out.println("AGC");
   else System.out.println("ARC");
 }
}