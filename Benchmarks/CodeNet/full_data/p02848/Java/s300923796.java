import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    for(int i=0;i<s.length();i++){
      System.out.println((char)(((s.charAt(i)-'A')+n)%26+'A'));
    }
  }
}