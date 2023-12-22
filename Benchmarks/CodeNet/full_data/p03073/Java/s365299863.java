import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, count_a = 0, count_b = 0, answer;
    char temp;
    String number = sc.next();
    for(i = 0; i < number.length(); i++) {
      temp = number.charAt(i);
      if(i % 2 == 0) {
        if(temp == '0') count_a++;
        else count_b++;
      } else {
        if(temp == '1') count_a++;
        else count_b++;
      }
    }
    answer = (count_a < count_b)? count_a : count_b;
    System.out.println(answer);
  }
}
