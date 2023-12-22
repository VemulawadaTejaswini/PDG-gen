import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int en = sc.nextInt();
    int gohyaku = en/500;
    int temp = en%500;
    int goen = temp/5;
    int ans = (gohyaku*1000)+(goen*5);
    System.out.println(ans);
  }
}