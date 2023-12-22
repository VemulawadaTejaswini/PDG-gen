import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();
    String T = sc.next();
    
    oneS = S.substring(0,1);
    twoS = S.substring(1,2);
    threeS = S.substring(2,3);
    
    oneT = T.substring(0,1);
    twoT = T.substring(1,2);
    threeT = T.substring(2,3);
    
    int count = 0;
    if (oneS.equals(oneT)) {
      count ++;
    }
    if (twoS.equals(twoT)) {
      count ++;
    }
    if (threeS.equals(threeT)) {
      count ++;
    }
    
    System.out.println(count);
  }
}