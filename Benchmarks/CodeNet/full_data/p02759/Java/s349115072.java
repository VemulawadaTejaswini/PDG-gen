import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    if(n % 2 == 0){
      ans = n / 2;
    }else{
      ans = n / 2;
      ans++;
    }
    System.out.println(ans);
  }
}