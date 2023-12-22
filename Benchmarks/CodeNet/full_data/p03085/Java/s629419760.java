import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String b = sc.next();
    List<String> l = new ArrayList<String>();
    l.add("A");
    l.add("T");
    l.add("C");
    l.add("G");
    l.remove(l.indexOf(b));
    if (b.equals("A") || b.equals("T")){
      System.out.println(l.get(0));
    }else{
      System.out.println(l.get(2));
    }
  }
}