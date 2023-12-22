import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> listA = new ArrayList<>();
		ArrayList<Integer> listB = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			listA.add(sc.nextInt());
		}
		for(int i=0;i<N;i++) {
			listB.add(sc.nextInt());
		}
		int countA=1;
		int countB=1;
		for(int i=0;i<N;i++) {
			countA+=(countorder(listA.get(0),listA)-1)*factor(N-i-1);
			listA.remove(0);
		}
		for(int i=0;i<N;i++) {
			countB+=(countorder(listB.get(0),listB)-1)*factor(N-i-1);
			listB.remove(0);
		}
		System.out.println(Math.abs(countA-countB));
	}
	
	
	static int factor(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*factor(n-1);
		}
	}
	
	static int countorder(int a,ArrayList<Integer> list) {
		int count=1;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)<a) {
				count++;
			}
		}
		return count;
	}
}