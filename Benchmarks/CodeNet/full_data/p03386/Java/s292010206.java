import java.util.Scanner;

class Rp1ABC093B {
  public static void main(String args[]){
    int A = 0;
    int B = 0;
    int K = 0;
    Scanner scan = new Scanner(System.in);
    A = scan.nextInt();
    B = scan.nextInt();
    K = scan.nextInt();
    scan.close();
    for(int i = 0;i < K; i++){
      System.out.println(A + i);
    }
    for(int i = 0;i < K; i++){
      System.out.println(B - i);
    }
  }
}