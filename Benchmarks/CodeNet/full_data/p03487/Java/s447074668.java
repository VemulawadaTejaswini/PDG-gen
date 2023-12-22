import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arrays=sc.nextInt();
		int[] kaziz=new int[arrays];

		for(int i=0; i<arrays; i++) {
			kaziz[i]=sc.nextInt();
		}
		Arrays.sort(kaziz);

		int[] arys=new int[100001];

		for(int i=0; i<arrays; i++) {
			if(kaziz[i]<=100000) {
				arys[kaziz[i]]++;
			}
			else {
				//
			}
		}

		int minx=114514810;

		for(int i=1; i<=100000; i++) {
			if(i<arys[i]) {
				if(minx>arys[i]-i) {
					minx=arys[i]-i;
				}
			}
		}
		System.out.println(minx);
	}
}