import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next()), y = Integer.parseInt(sc.next());
    for (int i = 0; i < n+1; i++){
      for (int j = 0; j < n-i + 1; j++){
        int k = n - i - j;
        int sum = 10000*i + 5000*j + 1000*k;
        if (sum == y){
          System.out.println(i + " " + j + " " + k);
          return;
        }
      }
    }
    System.out.println(-1 + " " + -1 + " " + -1);
  }
}
