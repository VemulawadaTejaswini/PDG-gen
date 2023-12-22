import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int w = 0, h = 0, num = a[n-1];
		for(int i=n-2;i>=0;i--) {
			if(a[i]==num) {
				if(w==0)
					w = num;
				else if(h==0)
					h = num;
			}
			else {
				num = a[i];
			}
			
			if(w!=0 && h!=0)
				break;
		}
		
		System.out.println(w*h);
	}
}
