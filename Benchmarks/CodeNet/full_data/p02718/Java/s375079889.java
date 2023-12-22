import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int N = stdIn.nextInt();
    int M = stdIn.nextInt();
    int X = 4*M;
    int[] s = new int[N];
    for (int i = 0; i<N; i++){
      s[i] = stdIn.nextInt();
    }
    int Sum = 0;
    for(int i = 0; i<N; i++){
      if(s[i]>(1/X)){
        Sum += 1;
      }
    }
    if(Sum >= M){
      System.out.println("Yes");
    }
    if(Sum < M){
      System.out.println("No");
    }
  }
}