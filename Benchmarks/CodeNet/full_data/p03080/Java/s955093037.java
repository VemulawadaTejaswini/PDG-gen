import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String s = sc.next();
    String str = "";
    int r = 0;
    int b = 0;
    for(int i = 0;i < a;i++){
      if(s.charAt(i)=='B')b++;
      else r++;
    }
    if(r > b)str = "Yes";
    else str = "No";
    System.out.println(str);
  }
}