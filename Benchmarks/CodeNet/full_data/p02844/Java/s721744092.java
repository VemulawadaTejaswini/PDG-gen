import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  String s=sc.next(),f="";
	  StringBuilder buff=new StringBuilder();
	  Set<String> set=new HashSet<>();
	  Map<Integer,String>map=new TreeMap<>();
	  for(int i=1;i<n-1;i++) {
		  buff.setLength(0);
		  s.substring(i+1,n).chars().distinct().forEach(c->buff.append((char)c));
		  map.put(i, buff.toString());
	  }
	  for(int i=0;i<n-2;i++) {
		  for(int j=i+1;j<n-1;j++) {
			  f=map.get(j);
			  for(int k=0;k<f.length();k++) {
				  set.add(s.substring(i, i+1)+s.substring(j, j+1)+f.substring(k, k+1));
				  //System.out.println(s.substring(i, i+1)+s.substring(j, j+1)+f.substring(k, k+1));
			  }
		  }
	  }
	  System.out.println(set.size());
  }
}
