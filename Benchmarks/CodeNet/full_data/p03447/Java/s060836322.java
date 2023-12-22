import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int counter = 0;

    int remain4b = x - a;

    while(remain4b > 0){
      remain4b = remain4b - b;
      counter++;
    }

    counter-- ;
    remain4b = x - a;
    int ans = remain4b - b * counter;
    if(ans == b){
      ans = 0;
    }
    System.out.println(ans);
  }
}
