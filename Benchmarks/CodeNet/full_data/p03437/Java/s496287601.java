import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(x%y == 0){
      System.out.println(-1);
    }else{
      System.out.println(x);
    }
  }
}