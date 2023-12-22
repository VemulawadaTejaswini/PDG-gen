import java.util.Scanner;
class Main{
  public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
    long K =scan.nextLong();
    long A = scan.nextLong();
    long B = scan.nextLong();
    if(A>=K){
      System.out.println(1);
      return;
    }
    if(A-B <= 0){
      System.out.println(-1);
      return;
    }
    long sub = A-B;
	long ans = 1 + (1+(K-A-1)/sub)*2;
    System.out.println(ans);
  }
}
