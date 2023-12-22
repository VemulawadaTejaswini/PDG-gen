import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		Arrays.sort(a);
		List<Integer>left=new ArrayList<>();
		List<Integer>right=new ArrayList<>();
		left.add(a[0]);
		right.add(a[0]);
		int i=0;
		int front=1;
		int back=a.length-1;
		while(true) {
			if(i%2==0) {
				if(Math.abs(right.get(right.size()-1)-a[back])>=Math.abs(left.get(left.size()-1)-a[back])) {
					right.add(a[back]);
					back--;
					if(right.size()+left.size()-1==a.length)break;
					left.add(a[back]);
					back--;
					if(right.size()+left.size()-1==a.length)break;
				}else {
					left.add(a[back]);
					back--;
					if(right.size()+left.size()-1==a.length)break;
					right.add(a[back]);
					back--;
					if(right.size()+left.size()-1==a.length)break;
				}
			}else {
				if(Math.abs(right.get(right.size()-1)-a[front])<Math.abs(left.get(left.size()-1)-a[front])) {
					right.add(a[front]);
					front++;
					if(right.size()+left.size()-1==a.length)break;
					left.add(a[front]);
					front++;
					if(right.size()+left.size()-1==a.length)break;
				}else {
					left.add(a[front]);
					front++;
					if(right.size()+left.size()-1==a.length)break;
					right.add(a[front]);
					front++;
					if(right.size()+left.size()-1==a.length)break;
				}
			}
			i++;
		}
		long ans=0;
		int in=0;
		for(int l:left) {
			if(in!=0)
			ans+=Math.abs(left.get(in-1)-l);
			in++;
		}
		in=0;
		for(int r:right) {
			if(in!=0)
			ans+=Math.abs(right.get(in-1)-r);
			in++;
		}
		System.out.println(ans);
	}
}
