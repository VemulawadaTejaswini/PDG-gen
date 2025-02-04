import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.exec();
	}
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
		int p = Integer.parseInt(sc.nextLine());
		String[] strArr = sc.nextLine().split(" ");
		sc.close();
		int[] aArr = new int[p];
		for(int i = 0; i < p ; i++) {
			aArr[i] = Integer.parseInt(strArr[i]);
		}
		
		int[] factArr = new int[p];
		int[] recipFactArr = new int[p]; 
		int[] powArr = new int[p];
		
		factArr[0] = 1;
		recipFactArr[0] = 1; 
		powArr[0] = 0;
		makeFactArr(factArr, recipFactArr, p);
		int[] coefArr = new int[p];
		for(int i = 0; i < p; i++) {
			if(aArr[i] == 0) {
				continue;
			}
			coefArr[p - 1] = (coefArr[p - 1] + munusSurplus(-1, p)) % p;
			int powValue = 1;
			for(int j = 1; j <= p - 1; j++) {
				powValue = (powValue * i) % p;
				int addValue;
				if(j % 2 == 0) {
					addValue = munusSurplus(factArr[p - 1] * recipFactArr[j] * recipFactArr[p - 1 - j] * powValue * (-1), p);
				}else {
					addValue = (factArr[p - 1] * recipFactArr[j] * recipFactArr[p - 1 - j] * powValue) % p;
				}
				coefArr[p - 1 - j] = (coefArr[p - 1 - j] + addValue)%p;
			}
			
			coefArr[0] = (coefArr[0] + 1) % p;
			//System.out.println(Arrays.toString(coefArr));
		}
		
		for(int i = 0; i < p; i++) {
			System.out.print(coefArr[i]);
			if(i == p - 1) {
				System.out.print("\n");
			}else {
				System.out.print(" ");
			}
		}
		
	}
	
	public long fact(long n) {
		long result = 1;
		for(long i = 1;i <= n;i++ ) {
			result *= i;
		}
		return result;
	}
	
	public void makeFactArr(int[] factArr, int[] recipFactArr, int base) {
		for(int i = 1; i < factArr.length; i++) {
			factArr[i] = (factArr[i -1] * i) % base;
			recipFactArr[i] = (recipFactArr[i-1]*makePowWithBase(i, base - 2, base))  % base;
 		}
	}
	
	public int makePowWithBase(int value, int time, int base) {
		int retVal = 1;
		for(int i = 0; i < time; i++) {
			retVal = (retVal * value)%base;
		}
		return retVal;
	}
	
	public int munusSurplus(int value, int base) {
		while(value < 0) {
			value += base;
		}
		return value;
	}

}
