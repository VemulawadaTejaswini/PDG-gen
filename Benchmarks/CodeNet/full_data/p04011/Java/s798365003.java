import java.util.*;
public class Main{
  public static void main(String[] args){
  	Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int K=sc.nextInt();
    int X=sc.nextInt();
    int Y=sc.nextInt();
    int sum=0;
    for(int time=1;time<=N;time++){
      if(time<=K) sum+=X;
      else sum+=Y;
    }
    System.out.println(sum);
  }
}