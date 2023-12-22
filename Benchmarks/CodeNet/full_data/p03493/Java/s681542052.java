import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ss = "1";
    int sum = 0;
    for(int i = 0; i < s.length();++i){
      if(s[i] == ss )
        ++sum;
    }
    System.out.println(sum);
  }
  
}