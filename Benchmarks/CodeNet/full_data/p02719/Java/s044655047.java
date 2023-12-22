import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   long n =kbd.nextLong();
   long k =kbd.nextLong();
   long x=0;
   long y=0;
   if(k=0){
     x=0;
   }else{
   if(n>=k){
   y=n/k;
   x=k*(y+1)-n;
 }else{
    x=n;
 }
}
  System.out.println(x);
}
 }
