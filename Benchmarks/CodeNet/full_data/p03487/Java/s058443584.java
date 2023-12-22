import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    long res=0;
    long[] a=new long[n];
    Map<Long,Long> map=new TreeMap<>();
    for(int i=0;i<n;i++) {
    	a[i]=sc.nextLong();
    	if(map.containsKey(a[i])) {
    		map.put(a[i], map.get(a[i])+1L);
    	}else {
    		map.put(a[i], 1L);
    	}
    }
    for (Long key : map.keySet()){
    	if(map.get(key)-key>=0) {
    		res+=Math.min(map.get(key)-key, map.get(key));
    	}else {
    		res+=map.get(key);
    	}
    }
    System.out.println(res);
  }
}
