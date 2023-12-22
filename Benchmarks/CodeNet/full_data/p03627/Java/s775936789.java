import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] an = new int[n];

    for (int i=0; i<n; i++) {
      int a = sc.nextInt();
      an[i]=a;
    }
    sc.close();

    Arrays.sort(an);
    int a1=0,a2=0;
    for (int i=n-1;i>0;i--) {
      if (a2!=0)
        break;
      if (an[i]==an[i-1]) {
        a2=a1;
        a1=an[i];
        i--;
      }
    }
    System.out.println(a1*a2);
  }
}