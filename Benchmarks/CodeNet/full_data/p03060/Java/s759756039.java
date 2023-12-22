import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    int[] x=new int[N];
    int[] y=new int[N];
    int sum=0;
    for(int i=0;i<N;i++){
      x[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
      y[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
      if(x[i]>=y[i]){
        sum+=x[i]-y[i];
      }
    }
    System.out.println(sum);
  }
}