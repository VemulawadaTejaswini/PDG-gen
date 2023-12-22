import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    int[] a;
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    a=new int[N];
    int tmp = 0;
    for(int i = 0;i < N;i++){
    a[i] = scan.nextInt();
    a[i] = (int) Math.pow(a[i] - N, 2);
    tmp+=a[i];
    }
    System.out.printf("%d\n",tmp);
  }
}