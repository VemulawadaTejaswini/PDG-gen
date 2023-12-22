import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		Map<Integer , Long> tm = new TreeMap<Integer , Long>();
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int a , b;
		for(int i = 0 ; i < n ; i++){
			a = Integer.parseInt(sc.next());
			b = Integer.parseInt(sc.next());
			if(tm.containsKey(a)){
				tm.put(a , b + tm.get(a));
			}else{
				tm.put(a , (long)b);
			}
		}
		sc.close();
		long yono = 0;
		for(int i : tm.keySet()){
			yono += i * tm.get(i);
			m -= tm.get(i);
			if(m <= 0){
				yono += i * (long)m;
				break;
			}
		}
		ou.print(yono + "\n");
		ou.flush();
    }
}