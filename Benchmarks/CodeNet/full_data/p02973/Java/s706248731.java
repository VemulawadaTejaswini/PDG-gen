import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<String> ();
		int N = sc.nextInt();
		long a[] = new long[N];
		long b[] = new long[N];
		int colorCount =1;
		a[0] = sc.nextLong();
		for (int i=0;i<N;i++) {
			b[i] =1000000001;
		}
		b[0] = a[0];
		long before =a[0];
		for (int i=1;i<N;i++) {
			a[i] = sc.nextLong();
			if (before>=a[i]) {
				boolean isFind=false;
				for (int j=0;j<colorCount;j++) {
					if (b[j]<a[i]) {
						b[j] =a[i];
						isFind =true;
						Arrays.sort(b);
						break;
					}
				}
				if (isFind==false) {
					colorCount++;
					b[colorCount-1]=a[i];
				}
			}
			before=a[i];
		}
		System.out.println(colorCount);
  	}

	private String addChar(String s,int location,char c) {
		StringBuffer sb = new StringBuffer();
		sb.append(s.substring(0,location));
		sb.append(c);
		if (location<s.length()) {
			sb.append(s.substring(location));
		}
		return sb.toString();
	}
}