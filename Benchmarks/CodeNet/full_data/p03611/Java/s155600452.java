import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] a = new int[n];
			int amax = 0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				amax = Math.max(a[i], amax);
			}
			
			List<Integer> cal = new ArrayList<Integer>(amax+1);
			
			for(int i=0;i<amax+1;i++) {
				cal.add(i, 0);
			}
			
			int ele = 0;
			
			for(int i=0;i<n;i++) {
				 ele = cal.get(a[i]);
				 cal.set(a[i], ele+1);
			}
			int maxn = 0;
			
			
			for(int i=0;i<amax+1;i++) {
				if(i==0) {
					maxn = Math.max(cal.get(i)+cal.get(i+1), maxn);
				}else if(i==cal.size()-1) {
					maxn = Math.max(cal.get(i-1)+cal.get(i), maxn);
				}else {
					maxn = Math.max(cal.get(i-1)+cal.get(i)+cal.get(i+1), maxn);
				}
				
			}

			
			
			System.out.println(maxn);
		}	
	}