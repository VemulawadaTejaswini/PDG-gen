import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),sum=0;
    Map<String, Integer> m=new LinkedHashMap<>();
    for(int i=0;i<n;i++) {
    	String s=sc.next();
    	int buff=sc.nextInt();
    	m.put(s, buff);
    }
    String x=sc.next();
    for (String nKey : m.keySet()){
        sum+=m.get(nKey);
        if(nKey.equals(x))sum=0;
        //System.out.println(nKey+":"+m.get(nKey));
    }
    System.out.println(sum);
  }
}
