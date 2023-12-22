import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    //a,bの最大公約数を素因数分解して出てきた素数の個数+1が答え
    long c = gcd(a,b);
    long answer = 0;
//    System.out.println(c);
    answer = 1;
    long tmp =0;
    for(long prime :primes(c)){
      if(tmp!=prime){
        answer = answer +1;
      }
      tmp=prime;
    }
    System.out.println(answer);
  }
  
    //最大公約数・最小公倍数（セットで使う）
    static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
  
//素因数分解
  static List<Long> primes(long c){ 
    List<Long> primenums= new ArrayList<Long>();
            long x = c;
            long y = x;
          for (long i = 2; i<(long) Math.floor(Math.sqrt((double)x)+1); i++) {
//            boolean divflg=false;
            while ((y % i) == 0 ) {
//               if(!divflg){
                primenums.add(i);
//               }
//                divflg=true;
                y = y/i;
            }
            
        }
    return primenums;
  }
  
}