import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ans=0;
		int a=scan.nextInt();
		int b[]=new int[a];
		for(int i=0;i!=a;i++) {
			b[i]=scan.nextInt();
		}
		if(a==1) {
			System.out.println(b[0]);
		}
		else {
		int i=0;
		int k=0;
		for(;;) {
			if(k==1) {
				break;
			}
			if(b[i]!=0) {
				for(int j=i;;j++) {
					if(j==a) {
						break;
					}
					if(b[j]==0) {
						break;
					}
					b[j]--;
				}
				ans++;
				i=0;
				for(int j=0;j!=a+1;j++) {
						if(j==a) {
							k=1;
							break;
					}
					if(b[j]!=0) {
						break;
					}
					
				}
				continue;
			}
			
			i++;
		}
		System.out.println(ans);
	}
		}
}