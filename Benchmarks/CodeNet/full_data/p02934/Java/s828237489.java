import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    final int[] A=new int[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
    }
    double a=0.0;
    for(int i=0;i<N;i++){
      a+=(double)1/(double)A[i];
    }
    double answer=(double)1/(double)a;
    System.out.println(answer);
  }
}
