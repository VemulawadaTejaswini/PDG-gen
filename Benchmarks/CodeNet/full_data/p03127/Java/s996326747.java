import java.util.Scanner;

public class Main{
  static int N;
  static int A[];
  static int ans;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    A = new int[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
    }
    for(int i=0;i<N-1;i++){
      gcd(i);
    }
    System.out.println(A[N-1]);
  }

  static void gcd(int m){
    int x = A[m];
    int y = A[m+1];
    int z = 0;
    if(x<=y){
      z = x;
      x = y;
      y = z;
    }
    while((z = x % y)!=0){
      x = y;
      y = z;
    }
    A[m+1]=y;
    }

}
