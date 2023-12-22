import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[2*M];
    int num = 0;
    for(int i=0;i<2*M;i++){
      a[i] = sc.nextInt();
    }
    for(int i=0;i<2*M;i=i+2){
      if(a[i]==1){
        num = a[i+1];
        for(int n=0;n<2*M;n=n+2){
          if(a[n]==num){
            if(a[n+1]==N){
              System.out.println("POSSIBLE");
              return;
            }
          }
        }
      }
    }
    System.out.println("IMPOSSIBLE");
  }
}