import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();

    int n = N * (N - 1) / 2;
    int m = M * (M - 1) / 2;
    
    int NM = n + m;
    System.out.println(NM);//nCr = nPr / r!
    						//nPr = n! / (n-r)!
  }
}