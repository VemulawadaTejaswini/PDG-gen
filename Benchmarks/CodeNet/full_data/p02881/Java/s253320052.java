import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = Long.parseLong(sc.next());
    long d = 0;
    long min = Long.MAX_VALUE;
    long ans = 0;
    
    for (long i=1; i<1000000; i++) {
      if(n%i == 0) {
        d = n/i;
        ans = d + i - 2;
        if(ans<min) {
          min = ans;
        }
      }
      if(n==i){
        break;
      }
    }
    
    System.out.println(min);
  }
}
