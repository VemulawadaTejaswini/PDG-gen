import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();

    long[] g = new long[5];
    for(int i=0;i<5;i++){
      g[i] = scan.nextLong();
    }

    long current = 0;

    for (int i=0;i<5;i++){
      if (current > base(n,g[i]) + i + 1){
        current += 1;
      }
      else{
        current = base(n,g[i]) + i + 1;
      }
    }

    Arrays.sort(g);
    System.out.println(4+base(n,g[0]));


  }

  static long base(long a, long b){
    long c = (long) a/b;
    if (b*c == a){
      return c;
    }
    return c+1;
  }
}
