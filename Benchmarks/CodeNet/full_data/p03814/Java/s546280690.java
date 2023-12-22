import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int A=0, Z=0;
    String S = sc.next();
    int s = S.length();
    for(int i=0; i<s; i++) {
      if(S.substring(i,i+1).equals("Z")) {
        Z= i+1;
      }
    }
    for(int j=0; j<s; j++) {
      if(S.substring(j,j+1).equals("A")) {
        A= j+1;
        break;
      }
    }
    System.out.println(Z - A + 1);
  }
}