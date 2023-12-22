import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String X  = sc.next();
    String[] words = X.split("[^ATCG]+");
    int max = 0;
    for(String word : words){
      if(word.length() > max){
        max = word.length();
      }
    }
    System.out.print(max);
  }
}
