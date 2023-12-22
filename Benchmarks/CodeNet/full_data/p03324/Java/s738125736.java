// ↓ Question Link ↓
// https://atcoder.jp/contests/abc100/tasks/abc100_b
import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int D = sc.nextInt();
    int N = sc.nextInt();

    if(D == 0){
      D = 1;
    }else if(D == 1){
      D = 100;
    }else if(D == 2){
      D = 10000;
    }

    int sum = 0;
    
    for(int i = 1; i <= N; i++){
      sum = (D * i);
    }

    System.out.println(sum);

  }
}