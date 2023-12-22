import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    Integer[] array = new Integer[N];
    int sum = 0;
    for(int i=0; i<N; i++){
      array[i] = sc.nextInt();
    }
    Arrays.sort(array,Collections.reverseOrder());
    for(int j=0; j<K; j++){
      sum += array[j];
    }
    System.out.println(sum);
  }
}