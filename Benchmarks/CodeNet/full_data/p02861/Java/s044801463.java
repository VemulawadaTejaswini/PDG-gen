import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] X = new int[N];
    int[] Y = new int[N];
    double Sum = 0;
    for(int i=0;i<N;i++){
      X[i] = sc.nextInt();
      Y[i] = sc.nextInt();
    }
    for(int start=0;start<N-1;start++){
      for(int end = start+1;end<=N-1;end++){
        Sum+=Math.sqrt(Math.pow(X[start]-X[end],2)+Math.pow(Y[start]-Y[end],2));
      }
    }
    double result = 2*Sum/N;
    System.out.println(result);
  }
}