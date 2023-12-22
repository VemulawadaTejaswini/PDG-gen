import java.util.*;

/**
 * @author masayamatu
 * 
 */
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] S = s.split("");
    
    int count = 1;

    
    for(int i = 1; i < S.length-1; i++) {
     if(S[i].equals(S[i+1]) && !S[i-1].equals(S[i])){
        i++;
      }
    count++;
    }
    System.out.println(count);
  }    
}