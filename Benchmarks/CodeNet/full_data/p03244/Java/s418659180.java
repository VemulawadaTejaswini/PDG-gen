import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<Integer, Integer> Gmap = new HashMap<>();
		Map<Integer, Integer> Kmap = new HashMap<>();
		Set<Integer>set=new HashSet<>();
		for (int i = 0; i < n; i++) {
			int key = scanner.nextInt();
			if (i % 2 == 0) {
				if (Gmap.containsKey(key)) {
					Gmap.put(key, Gmap.get(key) + 1);
				} else {
					Gmap.put(key, 1);
				}
			} else {
				if (Kmap.containsKey(key)) {
					Kmap.put(key, Kmap.get(key) + 1);
				} else {
					Kmap.put(key, 1);
				}
			}
			set.add(key);
		}
		
		if(set.size()==1) {
			System.out.println(n/2);
			return;
		}

		long ans=0;
		int maxkey=0;
		int Gkey=0;
		int Kkey=0;
		int i=0;
		for(int key:Gmap.keySet()) {
			if(i==0)maxkey=key;
			if(Gmap.get(maxkey)< Gmap.get(key))maxkey=key;
			i++;
		}
		Gkey=maxkey;
		i=0;
		for(int key:Kmap.keySet()) {
			if(i==0)maxkey=key;
			if(Kmap.get(maxkey)< Kmap.get(key))maxkey=key;
			i++;
		}
		Kkey=maxkey;
		if(Gkey==Kkey) {
			i=0;
			for(int key:Gmap.keySet()) {
				if(i==0)maxkey=key;
				if(Gmap.get(maxkey)< Gmap.get(key)&&key!=Gkey)maxkey=key;
				i++;
			}
			int Gkeyt=maxkey;
			i=0;
			for(int key:Kmap.keySet()) {
				if(i==0)maxkey=key;
				if(Kmap.get(maxkey)< Kmap.get(key)&&key!=Kkey)maxkey=key;
				i++;
			}
			int Kkeyt=maxkey;
			if(Gkeyt>Kkeyt) {
				Gkey=Gkeyt;
			}else {
				Kkey=Kkeyt;
			}
		}
		if(Gmap.size()!=1) {
		for(int key:Gmap.keySet()) {
			if(key!=Gkey)ans+=(long)Gmap.get(key);
		}
		}
		if(Kmap.size()!=1) {
		for(int key:Kmap.keySet()) {
			if(key!=Kkey)ans+=(long)Kmap.get(key);
		}
		}
		
		System.out.println(ans);
	}
}