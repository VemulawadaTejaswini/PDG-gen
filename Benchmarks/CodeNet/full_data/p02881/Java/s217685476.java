import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long N = sc.nextLong();
    long min = N;

    for(long i = 1; i <= Math.sqrt(N); i++){
      if(N % i == 0){
        if(min > i + N/i - 2){
          min = i + N/i - 2;
        }
      }
    }

    System.out.println(min);
  }
}
