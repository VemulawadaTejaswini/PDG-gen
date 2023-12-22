import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int k=scanner.nextInt();
		List<Integer>p=new ArrayList<>();
		List<Integer>m=new ArrayList<>();
		p.add(0);
		m.add(0);
		for(int i=0;i<n;i++) {
			int x=scanner.nextInt();
			if(x>0) {
				p.add(x);
			}else {
				m.add(x*-1);
			}
		}
		Collections.sort(m);
		long min=Integer.MAX_VALUE;
		for(int i=0;i<=k;i++) {
			int j=k-i;
			if(i>m.size()-1||j>p.size()-1) {
				continue;
			}
			int tmp=0;
			if(i==0||j==0) {
				tmp=m.get(i)+p.get(j);
			}else {
				tmp=Math.min(m.get(i)*2+p.get(j),m.get(i)+p.get(j)*2);
			}
			min=Math.min(min, tmp);
		}
		System.out.println(min);
	}
}
