import java.util.*;
 
public class Main {
 
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    List<Integer> list = new ArrayList<Integer>();
    while(sc.hasNext()) {
      list.add(sc.nextInt());
    }
    
    boolean distinct = true;
    for (int i = list.size() - 1; i > 0; i--) {
      int a = list.remove(i);
      if (list.indexOf(a) >= 0) {
        distinct = false;
        break;
      } else {
        continue;
      }
    }
    
    if (distinct) {System.out.println("Yes");} else {System.out.println("No");}
    
  }
  
}