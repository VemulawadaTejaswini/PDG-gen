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
    
    List<String> list = new ArrayList<>();
    for(int i = 0; i < S.length; i++) {
      list.add(S[i]);
    }
    String temp =list.get(0);
    list.remove(0);
    int count = 1;
    while(list.size() >= 1) {
      if(temp.equals(list.get(0)) && list.size() > 1) {
        temp=list.get(0)+list.get(1);
        list.remove(0);
        list.remove(0);
        count++;
      }else if(temp.equals(list.get(0))) {
        list.remove(0);
      }else if(!temp.equals(list.get(0))) {
        temp = list.get(0);
        list.remove(0);
        count++;
      }
  }
    System.out.println(count);
  }
}