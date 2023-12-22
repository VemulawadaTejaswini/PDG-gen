import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		List<Integer> l=new ArrayList<>();
		List<Integer> r=new ArrayList<>();
		
		l.add(0);r.add(0);
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			if(x<0){
				l.add(-x);
			}else{
				r.add(x);
			}			
		}
		Collections.sort(l);
		Collections.sort(r);
		
		long min=10000000000l;
		for(int i=0;i<=k;i++){
			if(i>=l.size() || i>=r.size() || k-i>=l.size() || k-i>=r.size() )continue;
			int t= Math.min( 2*l.get(i)+r.get(k-i), l.get(i)+2*r.get(k-i) );
			min=Math.min(min, t);
		}
		System.out.println(min);
	}
}