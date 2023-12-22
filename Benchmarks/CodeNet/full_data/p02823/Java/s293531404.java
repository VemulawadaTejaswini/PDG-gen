import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int count = 0;
    
    while (A != B) {
      if((A%2 == 0 && B%2 ==0) || (A%2 !=0 && B%2 != 0)) {
        A = A + 1;
        B = B - 1;
      }
      int distanceFromAtoOne = A - 1;
      int distanceFromBtoN = N - B;
      if(distanceFromAtoOne < distanceFromBtoN) {
        if(A==1){
          B = B - 1;
        }
        else {
          A = A - 1;
          B = B - 1;
        }
        count = count + 1;
      }
      else{
        if (B == N){
          A = A + 1;
        }
        else{
          A = A + 1;
          B = B + 1;
        }
        count = count + 1;
      }
    }
    System.out.println(count);
  }
}