import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    s = s.replace("ABC","1");
    int count = 0;
    for(int i = 0;i<s.length();i++){
      if(s.substring(i,i+1).equals("1"))count++;
    }
    System.out.println(count);
  }
}
