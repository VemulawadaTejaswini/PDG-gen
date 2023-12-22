import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    
    int[] left;
    left = new int[M];
    int[] right;
    right = new int[M];

    for ( int i = 0 ; i < M ; i++ ){
      left[i] = sc.nextInt();
      right[i] = sc.nextInt();
    }

    int min=0 , max=right[0] ;
    for(int i = 0; i < M; i++) {
      if(min < left[i]) {
          min = left[i];
      }
      if(max > right[i]) {
        max = right[i];
      }
    }

    if(max>N){
      max=N;
    }
    System.out.println(max-min+1);

  }
}