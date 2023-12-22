import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] a;
    int tmp = 0;
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    a=new int[N];
    for(int i = 0;i < N;i++){
    a[i] = scan.nextInt();
    a[i] = (int) Math.pow(a[i] - N, 2);
    tmp+=a[i];
    }
    System.out.printf("%d\n",tmp);
  }
}