import java.util.*;
public class Main {
  
    public static List<String> a = new ArrayList<>();
    public static List<String> b = new ArrayList<>();
    public static List<String> c = new ArrayList<>();
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		a.addAll(Arrays.asList(sc.next().split("")));
        b.addAll(Arrays.asList(sc.next().split("")));
        c.addAll(Arrays.asList(sc.next().split("")));
       
        String lastValue = "a";
        String ans = "";
        while(true) {
          lastValue = syori(lastValue);
          if(Character.isUpperCase(lastValue.charAt(0))) {
            ans = lastValue;
            break;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
    public static String syori(String value) {
      String next = "";
      switch (value) {
        case "a" :
          if (a.size() == 0) {
            next = "A";
          } else {
            next = a.get(0);
            a.remove(0);
          }
          break;
        case "b" :
          if (b.size() == 0) {
            next = "B";
          } else {
            next = b.get(0);
            b.remove(0);
          }
          break;
        case "c" :
          if (c.size() == 0) {
            next = "C";
          } else {
            next = c.get(0);
            c.remove(0);
          }
          break;
      }
      return next;
    }
}