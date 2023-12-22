import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte n = sc.nextByte(),c=0,i=0,j=0;
		int a[] = new int [n];
 
		while(c<n) {
			a[c] = sc.nextInt();
			c++;
		}
		sc.close();
 
		for(;i<n;i++) {
			for(;j<n;j++) {
				if(i==j) continue;
				if(a[i]==a[j]) {
					System.out.println("NO");
					return ;
				}
			}
		}
 
		System.out.println("YES");
		
	}
 
}