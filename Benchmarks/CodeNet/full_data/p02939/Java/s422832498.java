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
    
    int count1 = 1;
    int count2 = 1;
    
    for(int i = 0; i < S.length-1; i++) {
     if(S[i].equals(S[i+1])){
        i++;
      }
    count1++;
    }
    for(int i = 1; i < S.length-1; i++) {
      S[1] =S[0]+S[1];
      if(S[i].equals(S[i+1])){
        i++;
      }
      count2++;
    }
    System.out.println(Math.max(count1, count2));
    
  }    
}