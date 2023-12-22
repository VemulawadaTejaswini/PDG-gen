import java.util.Scanner;


public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = 1;
    int ans = 0;
    while(sum<b){
      ans++;
      sum+=a-1;
    }
    System.out.print(ans);
  }
}
