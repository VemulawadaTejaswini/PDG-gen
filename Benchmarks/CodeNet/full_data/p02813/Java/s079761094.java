import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] aArr = new int[n];
		int[] bArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			aArr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			bArr[i] = sc.nextInt();
		}
		sc.close();
		int a = getUnderNum(aArr);
		int b = getUnderNum(bArr);
		
		System.out.println(Math.abs(a - b));
	}
	
	public static int getUnderNum(int[] intArr) {
		
		int n = intArr.length;
		int retVal = 0;
		
		for(int i = 0; i < n - 1; i++) {
			
			int under = 0;
			for(int j = 0; j < i; j++) {
				if(intArr[j] < intArr[i]) {
					under++;
				}
			}
			
			retVal += (intArr[i] - 1 - under) * fact(n - i - 1); 
		}
		
		return retVal;
	}
	
	public static int fact(int n) {
		int retVal = 1;
		for(int i = 1; i <= n; i++) {
			retVal *= i;
		}
		return retVal;
	}
}
