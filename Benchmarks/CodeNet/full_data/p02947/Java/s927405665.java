import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		String s[]=new String[N];
		for(int i=0;i<N;i++) {
			s[i]=sc.next();
		}
		String t[]=new String[N];
		for(int i=0;i<N;i++) {
			char[] chars = s[i].toCharArray();
			Arrays.sort(chars);
			t[i] = java.util.Arrays.toString(chars);
		}
		long ans=0;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				if(t[i].equals(t[j])){
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}