import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String ans = "No";
    if(n%2==0){
      ans = "Yes";
      for(int i=0; i<n/2; ++i){
        if(s.charAt(i) != s.charAt(i+n))
          ans = "No";
      }
    }
    System.out.println(ans);
  }
}
