import java.util.Scanner;

class Main{
  public static void main(String args[]){
    int N;
    Scanner sc = new Scanner(System.in);
    
    N = sc.nextInt();
    if (N % 2 == 0){
      System.out.println(N / 2 - 1);
    }else{
      System.out.println((N-1)/2);
    }
  }
}