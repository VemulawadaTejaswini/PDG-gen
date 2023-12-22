import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int flag = 0;
		
		int n = sc.nextInt();
		int y = sc.nextInt();
		
		int i,j,k;
		
		for(i=0;i<=n;i++) {
			if(flag == 1) break;
			for(j=0;j<=n-i;j++) {
				if(flag == 1) break;
				for(k=0;k<=n-i-j;k++) {
					if (10000*i+5000*j+1000*k == y) {
						System.out.printf("%d %d %d\n",i,j,k);
						flag = 1;
						break;
					}
				}
			}
		}
		
		if(flag == 0) System.out.printf("-1 -1 -1\n");
	}
}
