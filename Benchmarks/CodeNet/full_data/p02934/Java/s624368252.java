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
      a+=1/A[i];
    }
    double answer=1/a;
    System.out.println(answer);
  }
}