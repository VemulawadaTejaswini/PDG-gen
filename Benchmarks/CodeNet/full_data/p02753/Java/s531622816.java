import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    if(s[0] != s[1] || s[0] != [2] || s[1] != s[2]) {
      System.out.println("Yes");
    } else {
	  System.out.println("No");
    }
  }
}