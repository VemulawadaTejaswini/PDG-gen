import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    long ans = Long.MAX_VALUE;
    for(int i = 0; i <= x; i++){
      for(int j = 0; j <= y; j++){
        int diff_x = Math.abs(x-i);
        int diff_y = Math.abs(y-j);
        int ab = 2*Math.max(diff_x,diff_y);
        long temp = (i*a) + (j*b) + (ab*c);
        if(temp < ans){
          ans = temp;
        }
      }
    }
    System.out.println(ans);
  }
}