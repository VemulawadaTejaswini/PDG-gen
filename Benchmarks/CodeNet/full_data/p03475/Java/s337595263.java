import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] c = new int[n-1];
		int[] s = new int[n-1];
		int[] f = new int[n-1];
		int[] t = new int[n];
		for(int i=0; i<n-1; i++){
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}
		for(int i=0; i<n-1; i++){
			for(int j=i; j<n-1; j++){
				if(t[i]<s[j])t[i] = s[j];
				else {
					if((t[i]-s[j])%f[j]==0)t[i] =  s[j] + ((t[i]-s[j])/f[j])*f[j];
					else t[i] = s[j] + ((t[i]-s[j])/f[j] + 1)*f[j];
				}
				t[i] += c[j];
			}
		}
		for(int i=0; i<n; i++){
			System.out.println(t[i]);
		}
	}
}