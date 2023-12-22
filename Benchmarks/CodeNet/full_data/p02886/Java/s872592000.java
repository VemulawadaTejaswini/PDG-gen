
import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];
    int sum = 0;
    
    for(int i = 0; i < N; i++){
      arr[i] = sc.nextInt();
    }

    for(int i = 0; i < N; i++){
      for(int j = i + 1; j < N; j++){
        sum = sum + (arr[i] * arr[j]);
      }
    }

    System.out.println(sum);

  }
}