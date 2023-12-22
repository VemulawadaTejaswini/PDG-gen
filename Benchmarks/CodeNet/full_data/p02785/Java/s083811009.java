import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] hp = new int[N];
    long sum = 0;
    for(int i=0; i<N; i++){
      int tmp = sc.nextInt();
      hp[i] = tmp;
    }
    Arrays.sort(hp);
    for(int i=0; i<N -K; i++){
      sum += hp[i];
    }
    System.out.println(sum);
  }
}

