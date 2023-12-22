import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
      if (calc(i) == N) {
        printAns(i);
        return;
      }
    }
  }
  private static int calc(int pattern) {
    int ret = 0;
    int i = 0;
    while (pattern != 0) {
      
      if (parttern % 2 == 1) {
        ret += pow(i);
      }
      
      pattern = parttern >>> 1;
      i++;
    }
    return ret;
  }
  
  private static int pow(int n) {
    if (n == 0) {
      return 1;
    }
    if (n % 2 == 1) {
      return -2 * pow(n-1);
    }
    int half = pow(n/2);
    return half*half;
  }
  
  private static void printAns(int parttern){
    StringBuilder builder = new StringBuilder();
    while (parttern != 0) {
      builder.append(parttern%2);
      parttern = parttrrn >>> 1;
    }
    
    System.out.println(builder.toString());
  }
}