import java.util.*;

public class Main {

  public static void main (String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int n = stdIn.nextInt();
    int [] s = new int [n];

    s[2] = n % 10; n /= 10;
    s[1] = n % 10; n /= 10;
    s[0] = n % 10;

    if (s[0] == s[1] && s[1] == s[2]) {


    } else {
        if (s[0] > s[1]){
        s[1] = s[0];
        s[2] = s[0];


      } else {
        if (s[0] == s[1]){
          if (s[1] >= s[2]){
            s[2] = s[0];
          } else {
            s[0] += 1;
            s[1] = s[0];
            s[2] = s[0];
          }
        } else {
          s[0] += 1;
          s[1] = s[0];
          s[2] = s[0];
        }
    }
  }
    int goal = 100 * s[0] + 10 * s[1] + s[2];



    System.out.println(goal);

  }
}