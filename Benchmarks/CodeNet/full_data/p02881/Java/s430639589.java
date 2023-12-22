import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double RootMin = 1.0e12;
    for (int i = 2; i < N / 2; i++){
      if (N % i == 0 & i + N / i < RootMin){
        RootMin = i + N / i;
      }
    }
    System.out.println((int)RootMin);
  }
}