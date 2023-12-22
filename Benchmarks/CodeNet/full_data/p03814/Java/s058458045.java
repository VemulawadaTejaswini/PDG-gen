import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String U = s.next();
    int a = 0;
    int b = U.length() - 1;
    while (U.charAt(a) != 'A'){
      a++;
    }
    while (U.charAt(b) != 'Z'){
      b--;
    }
    System.out.println(b - a + 1);
  }
}
