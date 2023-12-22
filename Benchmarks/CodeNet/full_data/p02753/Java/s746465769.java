import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String S = scanner.nextLine();
    String answer = "No";
    if(S.charAt(0) != S.charAt(1) || S.charAt(1) != S.charAt(2))answer = "Yes";
    System.out.println(answer);
  }
}