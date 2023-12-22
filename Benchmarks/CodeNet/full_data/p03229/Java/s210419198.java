
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    int[] rec = new int[n];

    for (int i=0;i<n;i++) {
      rec[i] = cin.nextInt();
    }

    Arrays.sort(rec);

    if (n==2) {
      System.out.println(Math.abs(rec[0]-rec[1]));
      return;
    }

    else if (n==3) {
      System.out.println(rec[1]+rec[2]-2*rec[0]);
      return;
    }

    if (n%2==0) {
      int sum = 0;
      for (int i=0;i<n;i++) {
        if (i<n/2) {
          sum-=rec[i];
        }
        else {
          sum+=rec[i];
        }
      }
      sum = sum*2;
      sum = sum - rec[n/2] + rec[n/2-1];
      System.out.println(sum);
      return;
    }
    else {
      int sum = 0;
      for (int i=0;i<n;i++) {
        if (i<(n+1)/2) {
          sum -= rec[i];
        }
        else {
          sum += rec[i];
        }
      }
      sum = sum*2;
      sum = sum + rec[(n-1)/2] + rec[(n-1)/2-1];
      System.out.println(sum);
      return;
    }
  }

}
