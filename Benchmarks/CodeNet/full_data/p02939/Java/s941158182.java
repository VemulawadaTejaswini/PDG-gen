import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	// スペース区切りの整数の入力
    char[] s = sc.next().toCharArray();
    HashMap<String, Integer> split = new HashMap<String, Integer>();
    String tmp = "";
    
    for(int i = 0; i < s.length; i++){
      tmp = tmp + String.valueOf(s[i]);
      if(!split.containsKey(tmp))
      {
        split.put(tmp, 0);
        System.out.println(tmp);
        tmp = "";
      }
    }
	
    System.out.println(split.size());
  }
}