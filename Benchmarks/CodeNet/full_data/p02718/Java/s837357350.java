import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int N = stdIn.nextInt();
    double M = stdIn.nextDouble();
    Double X = 4*M;
    Double Y = 1/X;
    int[] s = new int[N];
    for (int i = 0; i<N; i++){
      s[i] = stdIn.nextInt();
    }
    int G = 0;
    for(int i = 0; i<N; i++){
      G += s[i];
    }
    int Sum = 0;
    for(int i = 0; i<N; i++){
      if(s[i]>=G*Y){
        Sum += 1;
      }
    }
    if(Sum >= M){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}