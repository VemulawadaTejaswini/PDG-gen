import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    String result = "WA";
   	if(N==M) {
   		result = "AC";
   	}
    System.out.println(result);
  }
}