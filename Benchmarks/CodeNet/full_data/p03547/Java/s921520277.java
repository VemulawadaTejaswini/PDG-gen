import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   String A = sc.next();
   String B = sc.next();

   if(A<B) System.out.println("<");   
   else if(A.equals(B))System.out.println("=");
   else System.out.println(">");
 }
}