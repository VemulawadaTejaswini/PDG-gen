import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int n=s.length();
    String answer = "Yes";

    if (n%2==0) {
      answer = "No";
    }else{
      String s1=s.substring(0,n/2);
      String s2=s.substring(n/2+1);

      if (s1.equals(s2)) {
        answer = "Yes";
        char[] chars = s1.toCharArray();
                for (int i = 0; i < chars.length / 2; i++) {
                    if (chars[i] != chars[chars.length - (i + 1)]) {
                        answer = "No";
                        break;
                    }
                }
      }else{
        answer = "No";
      }

    }


    System.out.println(answer);


  }
}
