import java.util.Scanner;

class Main{
  Scanner sin = new Scanner(System.in);
  int N = sin.nextInt();
  int K = sin.nextInt();
  int X = sin.nextInt();
  int Y = sin.nextInt();
  
  if(N<=K){
    int XY = X*N;
  }else{
    int NK = N-K;
    int XY = X*K + Y*NK;
  }
  System.out.println(XY);
}  