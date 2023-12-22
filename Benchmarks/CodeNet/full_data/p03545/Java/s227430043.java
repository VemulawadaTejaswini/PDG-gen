import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String[] c = str.split("");
    String[] op = new String[4];
    op[3] = "=";
    int[] num = new int[4];
    int result = 0;
    StringBuilder answer = new StringBuilder();
    for(int i = 0; i < 4; i++) {
      num[i] = Integer.parseInt(c[i]);
    }
    outside: for(int i = 0; i < 2; i++) {
      for(int j = 0; j < 2; j++) {
        for(int k = 0 ; k < 2; k++) {
          if(i == 0) {
            op[0] = "+";
            result += (num[0] + num[1]);
          } else {
            op[0] = "-";
            result += (num[0] - num[1]);
          }
          if(j == 0) {
            op[1] = "+";
            result += num[2];
          } else {
            op[1] = "-";
            result -= num[2];
          }
          if(k == 0) {
            op[2] = "+";
            result += num[3];
          } else {
            op[2] = "-";
            result -= num[3];
          }
          if(result == 7) {
            for(int l = 0; l < 4; l++) {
              answer.append(Integer.toString(num[l]));
              answer.append(op[l]);
            }
            answer.append("7");
            System.out.println(answer);
            break outside;
          } else {
            result = 0;
          }
        }
      }
    }
  }
}
