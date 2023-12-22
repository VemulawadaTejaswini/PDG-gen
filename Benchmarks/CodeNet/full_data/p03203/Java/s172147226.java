import java.util.*;
import java.util.Map.*;

class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] $){
		int h=s.nextInt(),w=s.nextInt();
		int n=s.nextInt();
		
		TreeMap<Integer,ArrayList<Integer>>m=new TreeMap<>();
		
		int r=h;
		
		for(int i=0;i<n;++i){
			int x=s.nextInt();
			int y=s.nextInt();
			
			if(y==1) {
				r=x-1;
				continue;
			}
			
			m.computeIfAbsent(y,t->new ArrayList<>()).add(x);
		}
		m.entrySet().stream().forEach(o->o.getValue().sort(null));
		
		int x=1,y=1;
		
		
		for(Entry<Integer,ArrayList<Integer>> e:m.entrySet()) {
			x+=e.getKey()-y;
			y=e.getKey();
			ArrayList<Integer> l=e.getValue();
			
			int bin=Collections.binarySearch(l,x,null);
			if(bin>=0) {
				++x;
				for(int i=bin+1;i<l.size();++i) {
					if(l.get(i)!=x) {
						r=Math.min(r,l.get(i)-1);
						break;
					}
					++x;
				}
			}else {
				if(~bin<l.size()) {
					r=Math.min(r,l.get(~bin)-1);
				}
			}
			//System.err.println(x+" "+y+" "+r);
		}
		System.out.println(r);
	}
}
