import java.util.*;

class Main {
 public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int m = in.nextInt();
   String s = in.next();
   String t = in.next();
   
   int l = Math.max(n, m);
   while(true) {
     if(l % n != 0 || l & m != 0) {
        l++;
     } else {
        break; 
     }
   }
     
     if(l == Math.max(n, m)) {
       System.out.println(-1);
     } else {
       System.out.println(l); 
     }
 }
}