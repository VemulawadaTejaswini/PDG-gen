
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner sin=new Scanner(System.in);
	    int n=sin.nextInt();
		Map<String,Integer> mp=new HashMap<>();
		int max=0;
		for (int i = 0; i < n; i++) {
			String s=sin.next();
			if(mp.containsKey(s)){
				mp.put(s,mp.get(s)+1);
			}else mp.put(s,1);
			if(max<mp.get(s)) max=mp.get(s);
		}
		for (String key:mp.keySet()){
			if(mp.get(key)==max){
				System.out.println(key);
			}
		}
    }
}
