import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    List<Long> list=new ArrayList<>();
    Map<Long,Long> map=new TreeMap<>();
    for(int i=0;i<n;i++) {
    	long buff=sc.nextInt();
    	if(map.containsKey(buff)) {
    		map.put(buff, map.get(buff)+1);
    	}else {
    		map.put(buff, 1L);
    	}
    }
    for (Long key : map.keySet()){
    	if(map.get(key)>=2) {
    		long buff=map.get(key);
    		while(buff>=2) {
    			list.add(key);
    			buff-=2;
    		}
    	}
    }
    if(list.size()>=2)System.out.println(list.get(list.size()-1)*list.get(list.size()-2));
    else System.out.println(0);
  }
}
