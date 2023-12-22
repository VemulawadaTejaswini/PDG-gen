import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),sum=0;
    Map<String, Integer> m=new HashMap<>();
    for(int i=0;i<n;i++) {
    	String s=sc.next();
    	int buff=sc.nextInt();
    	m.put(s, buff);
    	sum+=buff;
    }
    String x=sc.next();
    for(String s:m.keySet()) {
    	if(s.equals(x))sum-=m.get(s);
    }
    System.out.println(sum);
  }
}
