import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.nextLine();
    for(int i=0;i<S.length();i++){
      if(S.charAt(i)=='h'){
        if(S.charAt(i+1)=='i'){
          System.out.println("Yes");
          break;
        }
        else{
          System.out.println("No");
        }
      }
    }
  }
}