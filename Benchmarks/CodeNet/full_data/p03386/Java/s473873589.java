import java.util.Scanner;

class Main {
  public static void main(String args[]){
    int A = 0;
    int B = 0;
    int K = 0;
    Scanner scan = new Scanner(System.in);
    A = scan.nextInt();
    B = scan.nextInt();
    K = scan.nextInt();
    scan.close();
    if((B - A)/2.0 > K){
    for(int i = 0;i < K; i++){
      System.out.println(A + i);
    }
    for(int i = 0;i < K; i++){
      System.out.println(B - K + i +1);
    }
  }
  else{
    for(int i = 0; i < B - A + 1; i++){
      System.out.println(A + i);
    }
  }
  }
}

