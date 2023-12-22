import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st=sc.next();
    String result="";
    StringBuffer sb = new StringBuffer(st);
    for(int i=1;i<sb.length();i++) {
      if (sb.charAt(0)=='B') {
        sb.deleteCharAt(0);
      }
      else if(sb.charAt(i)=='B') {
        sb.deleteCharAt(i);
        sb.deleteCharAt(i-1);
        }
    }      System.out.println(sb);

  }
}