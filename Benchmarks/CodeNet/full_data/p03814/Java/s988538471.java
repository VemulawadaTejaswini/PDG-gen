import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String S_ = sc.next();

    sc.close();

    String[] S = S_.split("");

    int count = 0;
    
    int max = 0;

    boolean start = false;

    boolean end = false;
    
    for (int i = 0; i < S.length; i++) {

      if (S[i].equals("A") && start == false) {
        start = true;
        end = false;
      } else if (S[i].equals("Z")){
        end = true;
      } else if (end && !(S[i].equals("Z"))) {
        max = Math.max(max, count);
        if (S[i].equals("A")) {
          start = true;
        } else {
          start = false;
        }
        end = false;
        count = 0;
      }
    
      if(start){
        count++;
      }

    }

    max = Math.max(max, count);

    System.out.println(max);

  }

}