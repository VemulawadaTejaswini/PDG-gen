import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long A = Long.parseLong(sc.next());
    long B = Long.parseLong(sc.next());
    long C = Long.parseLong(sc.next());
    long D = Long.parseLong(sc.next());
    long K = calc(C,D);
    
    long a = B/C;
    long b = (A-1)/C;
    long ab = a-b;
    
    long c = B/D;
    long d = (A-1)/D;
    long cd = c-d;
    
    long e = B/K;
    long f = (A-1)/K;
    long ef = e-f;
    
    long g = ab+cd-ef;
    long ans = B-A-g+1;
      
    System.out.println(ans);
  }
  public static long calc(long a, long b){
    long c = 0;
    int count = 1;
    if(a < b){
      while(true){
        long d = a * count;
        if(d % b == 0){
          c = d;
          break;
        }
        count++;
      }
    }else{
      while(true){
        long d = b * count;
        if(d % a == 0){
          c = d;
          break;
        }
      }
      count++;
    }
    return c;
  }
}