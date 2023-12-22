import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String, Integer> s = new HashMap<String, Integer>();
    char[] c;
    String ds;
    long ans = 0;
    int tmp;
    for (int i=0;i<n;i++){
      c = sc.next().toCharArray();
      Arrays.sort(c);
      ds = String.valueOf(c);
      tmp = s.getOrDefault(ds,0);
      ans += tmp;
      s.put(ds,tmp+1);
    }
    sc.close();
    System.out.println(ans);
  }
}