
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
     	int n = sc.nextInt();
     	long weight = sc.nextLong();
     	int[] w = new int[n];   
     	long[] v = new long[n];
     	for(int i=0;i<n;i++){
     		w[i] = sc.nextInt();
     		v[i] = sc.nextLong();
     	}
     	HashMap<Integer, Long> map = new HashMap<Integer, Long>();

     	for(int i=0;i<n;i++){
     		ArrayList<Point> list = new ArrayList<Point>();
     		if(w[i] <= weight){
     			if(map.containsKey(w[i]) && map.get(w[i])>v[i]){
     				
     			}
     			else{
	     			Point p = new Point(w[i], v[i]);
    	 			list.add(p);
    	 		}
     		}
     		for(Integer key : map.keySet()){
     			if(key+w[i] > weight){
     				break;
     			}
     			if(!map.containsKey(key+w[i])){
     				Point p = new Point(key+w[i], map.get(key)+v[i]);
     				list.add(p);
     			}
     			else if(map.get(key+w[i])<map.get(key)+v[i]){
     				Point p = new Point(key+w[i], map.get(key)+v[i]);
     				list.add(p);
     			}
     		}

     		for(int j=0;j<list.size();j++){
     			Point p = list.get(j);
     			map.put(p.x, p.y);
     		}

     	}

     	long ans = 0;
     	for(Integer key : map.keySet()){
     		ans = (long)Math.max(ans, map.get(key));
     	}

     	System.out.println(ans);
    }
}

class Point{
	int x;
	long y;
	Point(int x, long y){
		this.x = x;
		this.y = y;
	}
}
