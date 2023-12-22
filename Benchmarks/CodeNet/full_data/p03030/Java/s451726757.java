import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String a = "";
    int b = 0;
    //
	TreeMap<String, Integer> map = new TreeMap<String, Integer>();
    for (int i = 1;i<=n;i++){
      a = sc.next();
      b = 1000 - sc.nextInt();
      
      map.put(a + b, i);
    }
    
    Iterator<String> it = map.keySet().iterator();
    while (it.hasNext()) {
      String key = it.next();
      System.out.println(map.get(key));
    }
  }
}