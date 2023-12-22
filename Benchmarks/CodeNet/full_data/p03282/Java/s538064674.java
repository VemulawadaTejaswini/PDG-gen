import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] initial = sc.nextLine().split("");
    long K = sc.nextLong();
    long index = 1;
    String answer = "1";
    for (String num: initial) {
      if (num.equals("1") && index < K) {
        index++; 
      } else {
        answer = num;
        break;
      }
    }  
    System.out.println(answer);
  }
}