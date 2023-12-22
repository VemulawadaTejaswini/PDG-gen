import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<Integer,Integer> buka = new LinkedHashMap<Integer,Integer>();
    for(int i = 1; i <= n; i++){
      buka.put(i,0);
    }
    for(int i = 0; i < n; i++){
      int a = sc.nextInt();
      int temp = buka.get(a) + 1;
      buka.put(a,temp);
    }
    for(int i = 1; i <= buka.size(); i++){
      System.out.println(buka.get(i));
    }
  }
}