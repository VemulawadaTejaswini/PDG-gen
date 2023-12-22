import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("N: ");
		int n = kb.nextInt();
		
		System.out.print("A: ");
		int[]numA = new int[n];
		
		boolean exist_odd = false;
		
		for(int i=0; i< n; i++) {
			numA[i] = kb.nextInt();
			if(numA[i]%2 == 1) //奇数の場合
				exist_odd = true;
		}
		if(exist_odd == true) //奇数フラグtrueの場合
			System.out.println(0);
		else { //全て偶数の場合
			int min = Integer.MAX_VALUE;
			for(int i=0; i< n; i++) {
				int ans = 0;
				while(numA[i] %2 == 0) { 
					numA[i] /= 2;
					ans++;
				}
				min = Math.min(min, ans);
			}
			System.out.println("answer: "+min);
          kb.close();
		}
    }