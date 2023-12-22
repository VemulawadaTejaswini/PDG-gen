import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextLong();
    int[] hp = new int[N];
    long sum = 0;
    for(int i=0; i<N; i++){
      int tmp = sc.nextLong();
      hp.add(tmp);
    }
    Arrays.sort(hp);
    for(int i=0; i<N -K; i++){
      sum += tmp;
    }
    System.out.println(sum);
  }
}

