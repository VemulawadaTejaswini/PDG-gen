import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int r = scan.nextInt() * 100;
    int g = scan.nextInt() * 10;
    int b = scan.nextInt();
    if((r + g + b) % 4 == 0){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}