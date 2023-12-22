import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		int maxGCD=0;
		int cGCD=0;
		for(int i=0;i<n;i++) {
			cGCD=0;
			for(int j=0;j<n;j++) {
				if(i==j)continue;
				cGCD = calcGCD(cGCD,a[j]);
				if(maxGCD > cGCD)break;
			}
			maxGCD = Math.max(maxGCD, cGCD);
		}
		
		
		System.out.println(maxGCD);;
		
	}
	
	public static int calcGCD(int a,int b) {
		if(a==0)return b;
		if(b==0)return a;
		if(a < b) {
			b = b-a;
			a = a+b;
			b = a-b;
		}
		int amr = a % b;
		if(amr != 0) {
			return calcGCD(b, amr);
		}else {
			return b;
		}
		
	}
	
	public static int calcGCD(int a) {
		return a;
	}

}
