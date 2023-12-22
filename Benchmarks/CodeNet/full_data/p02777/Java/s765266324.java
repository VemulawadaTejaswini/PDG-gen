import java.util.*;
class Main{
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int c = sc.nextInt();
    int d = sc.nextInt();
    String j = sc.next();
   if(a.equals(j)){
     c = c - 1;
   } else if(b.equals(j)){
   d = d - 1; 
   }
   System.out.println(c);
   System.out.println(d);
 } 
}