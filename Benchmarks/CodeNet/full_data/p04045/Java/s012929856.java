import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] pNum = new int[K];
		int[] nonPNUM = new int[10];
		for(int i = 0; i < 10; i++) {
			nonPNUM[i] = 1;
		}
		for(int i = 0; i < K; i++) {
			int n = sc.nextInt();
			pNum[i] = n;
			nonPNUM[n] = -1;
		}
		sc.close();
		int[] bd = breakDown(N);
		replace(bd, pNum, nonPNUM);
		StringBuilder sb = new StringBuilder();
		for(int x: bd) {
			sb.append(x);
		}
		System.out.println(sb.toString());
		
	}
	
	static void replace(int[] bd, int[] pNum, int[] nonPNUM) {
		int min = findMin(nonPNUM);
		for(int i = 0; i < bd.length; i++) {
			int n = bd[i];
			if(findInP(n, pNum)) {
				int next = findNext(n, nonPNUM);
				if(next != -1) {
					bd[i] = next;
					for(int j = i + 1; j < bd.length; j++) {
						bd[j] = min;
					}
				}
				break;
			}
		}
	}
	
	static boolean findInP(int i, int[] pNum) {
		for(int x: pNum) {
			if(x == i) return true;
		}
		return false;
	}
	
	static int findNext(int n, int[] nonPNUM) {
		for(int i = 0; i < nonPNUM.length; i++) {
			if(nonPNUM[i] != -1 && i > n) return i;
		}
		return -1;
	}
	
	static int findMin(int[] nonPNUM) {
		for(int i = 0; i < nonPNUM.length; i++) {
			if(nonPNUM[i] != -1) return i;
		}
		return -1;
		
	}
	
	static int[] breakDown(int num) {
		LinkedList<Integer> nums = new LinkedList<Integer>();
		while(num != 0) {
			nums.addFirst(num % 10);
			num /= 10;
		}
		return nums.stream().mapToInt(Integer::intValue).toArray();
	}

}
