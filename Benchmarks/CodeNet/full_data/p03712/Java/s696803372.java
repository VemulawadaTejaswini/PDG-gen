import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   String sharp = "";
   for(int i = 0;i<B+2;i++) sharp+="#";
   System.out.println(sharp);
   for(int i = 0;i<A;i++) System.out.println("#"+sc.next()+"#"); 
   System.out.println(sharp);
 }
}