import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int m = sc.nextInt();
    int c = sc.nextInt();
    int[] b = new int[m];
    int sum = 0;
    int count = 0;
    for(int k=0;k<b.length;k++) {
      b[k] = sc.nextInt();
    }
    int i=0;
    while(i<n) {
      int[] a = new int[m];
      for(int j=0;j<m;j++) {
        a[j] = sc.nextInt();
      }
      for(int x=0;x<m;x++) {
        sum=sum + a[x] * b[x];
      }
      sum = sum+c;
      count = count + (sum>0) ? 1:0;
      i++;
    }
    System.out.println(count);



    }
  }
