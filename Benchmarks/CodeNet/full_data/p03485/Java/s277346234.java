import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    double a = sc.nextInt();
    double b = sc.nextInt();
    
    double average = (a + b) / 2;
    
    if (average % 1 != 0) {
      average += 0.5;
      int answer = (int) average;
      System.out.println(answer);
    } else {
      int answer = (int) average;
      System.out.println(answer);
    }
  }
}