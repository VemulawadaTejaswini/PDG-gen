import java.util.Scanner;

public class Main {
	static long solve(long T1 , long T2 , long A1 , long A2 , long B1 , long B2){
		long LA = T1 * A1 + T2 * A2;
		long LB = T1 * B1 + T2 * B2;
		if(LA == LB){
			return -1;
		}
		if(A1 > B1 && A2 > B2){
			return 0;
		}
		if(B1 > A1 && B2 > A2){
			return 0;
		}
		if(A1 < B1 && A2 > B2){
			if(LA < LB){
				return 0;
			}
			long lead = LA - LB;
			long LA1 = T1 * A1;
			long LB1 = T1 * B1;
			long k = (LB1 - LA1) / lead;
//			System.out.println(LA+" "+LB+" "+(LA - LB)+" "+(LB1 - LA1) +" "+k);
			return 2 * k + 1;
		}
		if(A1 > B1 && A2 < B2){
			if(LA > LB){
				return 0;
			}
			long lead = LB - LA;
			long LA1 = T1 * A1;
			long LB1 = T1 * B1;
			long k = (LA1 - LB1) / lead;
			return 2 * k + 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long T1 = sc.nextLong();
		long T2 = sc.nextLong();
		long A1 = sc.nextLong();
		long A2 = sc.nextLong();
		long B1 = sc.nextLong();
		long B2 = sc.nextLong();
		long ret = solve(T1 , T2 , A1 , A2 , B1, B2);
		if(ret < 0){
			System.out.println("infinity");
		}else{
			System.out.println(ret);
		}
	}
}
