import java.util.Scanner;
import java.util.Arrays;

public class Main{
  static int n;
  static int[] a;

  static final boolean DEBUG = false;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }

    int count = 0, count2 = 0;
    int sum = a[0];
    int sum2 = a[0] < 0 ? 1 : -1;
    count2 = Math.abs(sum2 - a[0]);
    for(int i = 1; i < n; i++){
      int val = a[i], val2 = a[i];
      if(!((sum > 0 && sum + a[i] < 0) || 
            (sum < 0 && sum + a[i] > 0))){
        val = -sum + ((sum < 0) ? 1 : -1);
        count += Math.abs(val - a[i]);
      }
      if(!((sum2 > 0 && sum2 + a[i] < 0) || 
            (sum2 < 0 && sum2 + a[i] > 0))){
        val2 = -sum2 + ((sum2 < 0) ? 1 : -1);
        count2 += Math.abs(val2 - a[i]);
      }
      sum += val;
      sum2 += val2;
    }

    if(DEBUG){
      System.out.println(Arrays.toString(a));
    }

    System.out.println(Math.min(count, count2));
  }
}
