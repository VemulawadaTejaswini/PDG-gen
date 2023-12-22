import java.util.*;


public class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    double[] P = new double[N];
    double max = 0.0;

    for(int i = 0;i < N;i++){
      P[i] = sc.nextDouble();
    }

    for(int i = 0;i < N-K+1;i++){
      double count = 0.0;
      for(int j = i;j < i+K;j++){
        count += (P[j]+1)*0.5;
      }
      if(count > max){
        max = count;
      }
    }
    System.out.print(max);
  }
}
