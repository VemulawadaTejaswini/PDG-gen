import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String p = sc.next();
    char[] s = new char[n];
    int d = 1;
    for(int i = 0;i<n;i++){
      s[i] = p.charAt(i);
    }
    for(int i = 0;i<n-1;i++){
      if(s[i]!=s[i+1]){
        d++;
      }
    }
    System.out.println(d);
  }
}
