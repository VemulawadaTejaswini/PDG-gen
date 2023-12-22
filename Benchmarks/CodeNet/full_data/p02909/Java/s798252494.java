import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    if(S.equals("Sunny")) {
      System.out.println("Cloud");
    }else if(S.equals("Cloud")) {
      System.out.println("Rainy");
    }else if(S.equals("Rainy")) {
      System.out.prinltn("Sunny");
    }
  }
}
  