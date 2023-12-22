import java.util.*;
class Main{
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();
    long c = sc.nextInt();
    for(long i = 0; i < c; i++){
      if(1 <= a){
      a = a - 1;
      } else if(1 <= b) {
      b = b - 1;
      }
    }  
   System.out.println(a);
   System.out.println(b);
 } 
}