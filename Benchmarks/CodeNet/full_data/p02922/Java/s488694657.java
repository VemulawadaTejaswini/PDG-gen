import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int sum = 0;
    int ans = 0;
    while(sum-1 < b){
      sum += (a-1);
      ans++;
    }
    System.out.println(ans-1);
  }
}