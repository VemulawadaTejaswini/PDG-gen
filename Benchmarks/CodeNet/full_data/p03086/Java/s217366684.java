import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char c ;
    int counter = 0;
    int ans =0;
    for(int i=0;i<s.length();i++) {
      c=s.charAt(i);
      if(c=='A' || c=='C' || c=='G' || c=='T' ) {
        counter++;
        ans = Math.max(ans, counter);
      } else {
        ans = Math.max(ans, counter);
        counter = 0;
      }
    }
    System.out.println(ans);

    }
  }
