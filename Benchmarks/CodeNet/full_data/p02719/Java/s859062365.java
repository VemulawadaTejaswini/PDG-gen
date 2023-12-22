import java.util.Scanner;
class Main{
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 
 long N = scan.nextLong();
 long K = scan.nextLong();
 long x = N % K;
 long y = Math.abs(K - x);
    if(x > y){
      x = y;
    }
  System.out.println(x);
 }
}