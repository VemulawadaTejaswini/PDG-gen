import java.util.*;

public class b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String S[] = s.split("");
    int red = 0;
    int blue = 0;
    String R = "R";
    String B = "B";
    for(int i = 0;i < s.length();i++){
      if(S[i].equals(R)){
        red++;
      }
      else if(S[i].equals(B)){
        blue++;
      }
    }

    if(red > blue){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
