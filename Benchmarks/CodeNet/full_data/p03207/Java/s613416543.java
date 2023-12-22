import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] price = new int[N];
    int sum = 0;
    int max = 0;
    for(int i=0; i<N; i++){
      int tmp = sc.nextInt();
      sum += tmp;
      price[i] = tmp;
      max = Math.max(tmp, max);
    }
    sum = sum - max + (max/2);
    System.out.print(sum);
  }
}
