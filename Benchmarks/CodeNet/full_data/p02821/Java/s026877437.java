import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();    
    long m = sc.nextInt();    
    Long a[] = new Long[(int)n];
    
    long result = 0;
    long sum = 0;
    for (int i=0; i<n; i++) {
      a[i] = sc.nextLong();
      sum += a[i];
    }
    Arrays.sort(a, Collections.reverseOrder());
    
    long subM = m;
    long count = 0;
    long rest = 0;
    while (subM>0) {
      subM -= (n-1-count) * 2 + 1;
      count++;
      if (subM<0) { // 0を割る場合は、余りをrestに入れる。割らない(0となる)場合は、rest=0
        count--;
        rest = subM + ((n-1-count) * 2 + 1);
      }
    }
    
    for (int i=0; i<count; i++) {
      result += (a[i]*(n-1-i) + sum) * 2;
      sum -= a[i];
    }
    
    if (rest>0) {
      if (rest == 1) {
        result += a[(int)count] * 2;
      }
      else {
        result += a[(int)count] * 2;
        rest--;
        if (rest%2==0) {
          rest /= 2;
          for (int i=0; i<rest; i++) {
            result += (a[(int)count + i + 1] + a[(int)count]) * 2;
          }
        }
        else {
          rest /= 2;
          for (int i=0; i<rest; i++) {
            result += (a[(int)count + i + 1] + a[(int)count]) * 2;
            if (rest-i==1) {
              result += a[(int)count] + a[(int)count + i + 2];
            }
          }
        }
      }
    }
    
    
    System.out.println(result);
  } 
}