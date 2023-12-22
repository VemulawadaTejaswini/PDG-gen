import java.util.Arrays;
import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	int[] L=new int[N];
	int[] L2=new int[N];
	for(int i=0;i<N;i++) {
		L[i]=sc.nextInt();
	}
	Arrays.sort(L);
	for(int i=0;i<N;i++) {
		L2[i]=L[N-1-i];
	}
	int ans=0;
	for(int i=0;i<N-2;i++) {
		for(int j=i+1;j<N-1;j++) {
			for(int z=j+1;z<N;z++) {
				if(L2[i]<L2[j]+L2[z]) {
					ans++;
				}
			}
		}
	}
	System.out.println(ans);
}
}