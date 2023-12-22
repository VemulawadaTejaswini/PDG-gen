import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int sLen = s.length();
    int minDif = Integer.MAX_VALUE;
    
    for (int i=0;i<=sLen-3;i++) {
      int num = new Integer(s.substring(i,i+3));
      int dif = Math.abs(753 - num);
      minDif = minDif>dif?dif:minDif;
    }
    System.out.println(minDif);
  }
}