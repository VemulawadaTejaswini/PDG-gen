import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int n = str.length();
    for(int i=0;i<n;i=i+2){
      System.out.print(str.charAt(i));
    }
  }
}