import java.util.*;
public class Main{
	static int Dan1(int[] d, int key){
		Arrays.sort(d);
		int pl = 0;
		int pr = d.length - 1;
		int pc = 0;
		int ppc = 0;
		while(pl<=pr){
			pc = (pl + pr) / 2;
			if(d[pc]==key){
				ppc = pc;
				for(int i=ppc; i>=0; i--){
					if(d[i]==key)pc = i;
					else break;
				}
				return pc;
			}
			if(d[pc]<key)pl = pc + 1;
			else pr = pc - 1;
		}
		if(d[pc]>key)return pc;
		else return pc + 1;
	}

	static int Dan2(int[] d, int key){
		Arrays.sort(d);
		int pl = 0;
		int pr = d.length - 1;
		int pc = 0;
		int ppc = 0;
		while(pl<=pr){
			pc = (pl + pr) / 2;
			if(d[pc]==key){
				ppc = pc;
				for(int i=ppc; i<d.length; i++){
					if(d[i]==key)pc = i;
					else break;
				}
				return d.length - pc-1;
			}
			if(d[pc]<key)pl = pc + 1;
			else pr = pc - 1;
		}
		if(d[pc]>key)return d.length - pc;
		else return d.length - pc -1;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++){
			b[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++){
			c[i] = sc.nextInt();
		}
		int num = 0;
		for(int i=0; i<n; i++){
			num += Dan1(a, b[i]) * Dan2(c, b[i]);
		}
		System.out.println(num);
	}
}