import java.awt.*;
import java.io.*;
import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
//		new TestC().doIt();
//		new TestD().doIt();
		new TestE().doIt();
	}
	class TestE{
		void doIt(){
			int N = sc.nextInt();
			int K = sc.nextInt();
			long A[] = new long[N];
			long sum = 0;
			for(int i = 0;i < N;i++){
				A[i] = sc.nextLong();
				sum = sum + A[i];
			}
			System.out.println(maxGCD(N,K,A,sum));
		}
		long maxGCD(int N,int K,long A[],long sum){
			long result = 0;
			for(int i = 1;i <= 30000;i++) {
				if(sum % i == 0) {
					long B[] = new long[N];
					long plusSum = 0;
					long minusSum = 0;
					for(int j = 0;j < N;j++) {
						B[j] = B[j] + (A[j] % i);
						plusSum = plusSum + B[j];
					}
					Arrays.sort(B);
					for(int j = N-1;j >= 0;j--) {
						plusSum = plusSum - i;
						minusSum = minusSum + Math.abs((B[j] - i));
						if(plusSum == 0)break;
					}
					if(minusSum <= K)result = i;
//					System.out.println(minusSum+" "+i);
				}
			}
			return result;
		}
	}
	class TestD{
		void doIt(){
			String S = sc.next() + 'R';
			int length = S.length();
			char setRL[] = S.toCharArray();
			int children[] = new int[length];
			moveChildren(setRL,children,length);
			for(int i = 0;i < length-2;i++){
				System.out.print(children[i]+" ");
			}
			System.out.println(children[length - 2]);
		}
		void moveChildren(char RLSet[],int children[],int length){
			char c = 'R';
			int cnt = 1;
			for(int i = 1;i < length;i++) {
				if(RLSet[i] == c) {
					cnt++;
				}else {
					if(c == 'R') {
						children[i - 1] = children[i - 1] + (cnt / 2) + (cnt % 2);
						children[i] = children[i] + (cnt / 2);
						c = 'L';
						cnt = 1;
					}else {
						children[i - cnt - 1] = children[i - cnt - 1] + (cnt / 2);
						children[i - cnt] = children[i - cnt] + (cnt / 2) + (cnt % 2);
						c = 'R';
						cnt = 1;
					}
				}
			}
		}
	}
	class TestC{
		void doIt(){
			int N = sc.nextInt();
			int H[] = new int[N];
			for(int i = 0;i < N;i++){
				H[i] = Integer.parseInt(sc.next());
			}
			boolean result = canMonotonousDecrease(N,H);
			if(result){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
 		}
		boolean canMonotonousDecrease(int N,int H[]){
			for(int i = 1;i < N;i++){
				int diff = H[i] - H[i-1];
				if(diff > 0)H[i] = H[i] - 1;
				else if(diff < 0)return false;
			}
			return true;
		}
	}
}