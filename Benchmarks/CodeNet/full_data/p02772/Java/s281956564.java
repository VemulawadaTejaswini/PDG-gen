import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int A[] = new int[N];
    for(int i = 0;i < N;i++){
      A[i] = scanner.nextInt();
    }
    String answer = "APPROVED";
    for(int i = 0;i < N;i++){
      int a = A[i];
      if(a % 2 == 0){
        if(!(a % 3 == 0 || a % 5 == 0)){
          answer = "DENIED";
          break;
        }
      }
    }
    System.out.println(answer);
  }
}
