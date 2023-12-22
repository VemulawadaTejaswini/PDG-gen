import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char tmp = str.charAt(0);
    int sum = 0;
    for(int i = 1; i < str.length(); i++){
      if(tmp != str.charAt(i)){
        tmp = str.charAt(i);
        sum++;
      }
    }
    System.out.println(sum);
  }
}