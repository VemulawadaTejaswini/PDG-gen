import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    int score = 0;
    for ( char sign : line.toCharArray() ) {
      if ( sign == '+' ) {
        score++;
      } else if ( sign == '-' ) {
        score--;
      }
    }
    System.out.println(score);
  }
}