import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    String result = "No";
   	if(N==M) {
   		result = "Yes";
   	}
    System.out.println(result);
  }
}