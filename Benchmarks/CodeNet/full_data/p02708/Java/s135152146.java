import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();   
    int k = sc.nextInt();
    int ans = 0;
    int max = n;
    int min = 0;
    for(int i = 1;i <= n;i++){
      if(k < i){
        ans += max - min - 1;
      }
      max += (n - i);
      min += i;
    }
  }
}