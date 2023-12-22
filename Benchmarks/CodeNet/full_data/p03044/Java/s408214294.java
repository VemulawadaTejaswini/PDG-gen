import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b[]=new int[a];
		for(int i=0;i<a-1;i++) {
			int u=scan.nextInt();
			int v=scan.nextInt();
			int w=scan.nextInt();
			if(w%2==0) {
				if(b[u-1]==1) {
					b[v-1]=1;
				}
				else if(b[v-1]==1) {
					b[u-1]=1;
				}
				else if(b[u-1]==0) {
					b[v-1]=0;
				}
				else if(b[v-1]==0) {
					b[u-1]=0;
				}
			}
			else {
				if(b[u-1]==0) {
					b[v-1]=1;
				}
				else if(b[v-1]==0) {
					b[u-1]=1;
				}
				else if(b[u-1]==1) {
					b[v-1]=0;
				}
				else if(b[v-1]==1) {
					b[u-1]=0;
				}
			}
		}
		for(int i=0;i<a;i++) {
			System.out.println(b[i]);
		}
	}
}
