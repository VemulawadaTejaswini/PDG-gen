
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		TreeMap<Integer,TreeSet<Integer>> tmap=new TreeMap<>(Collections.reverseOrder());
		for(int i=0;i<n;i++) {
			int a=scn.nextInt();
			int b=scn.nextInt();
			if(a<=m) {
				if(tmap.containsKey(b)) {
					TreeSet<Integer> set=tmap.get(b);
					set.add(a);
					tmap.put(b, set);
				}else {
					TreeSet<Integer> set=new TreeSet<>(Collections.reverseOrder());
					set.add(a);
					tmap.put(b, set);

				}
			}
		}
		long reward=0;
		//System.out.println(tmap);
			while(m>0 && tmap.size()>0) {
				//System.out.println(m+" "+tmap);
				int x=tmap.firstKey();
				TreeSet<Integer> set=tmap.get(x);
				Iterator<Integer> iterator = set.iterator();
				int flag=0;
				while(iterator.hasNext()) {
					int y=iterator.next();
					if(m-y>=0) {
						flag=1;
						reward+=x;
						m--;
						set.remove(y);
						if(set.size()==0) {
							tmap.remove(x);
						}
						break;
					}
				}
				if(flag==0) {
					break;
				}
				
				
			} 
		
		System.out.println(reward);
	}

}
