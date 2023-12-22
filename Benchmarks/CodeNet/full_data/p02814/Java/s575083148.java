import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		ArrayList<Integer> listA = new ArrayList<>();
		for(int i=0;i<N;i++) {
			listA.add(sc.nextInt());
		}
		
		boolean flag = true;
		Integer[] tmpA = new Integer[listA.size()];
		listA.toArray(tmpA);
		for(int i=0;i<N-1;i++) {
			if(divCountByTwo(tmpA[i])!=divCountByTwo(tmpA[i+1])) {
				flag = false;
				break;
			}
		}
		
		
		if(flag) {
			while(listA.size()>1) {
				int tmp1 = listA.remove(listA.size()-1);
				int tmp2 = listA.remove(listA.size()-1);
				listA.add(lcm(tmp1,tmp2));
			}
			int T = listA.get(0)/2;
			int tmp = M/T;
			if(tmp%2==1) {
				System.out.println(tmp/2+1);
			}else {
				System.out.println(tmp/2);
			}
		}else {
			System.out.println(0);
		}
		
		
	}
	
	static boolean isOddAndPlus(int n) {
		if(n%2==1 && (n-1)/2>=0) {
			return true;
		}else{
			return false;
		}
	}

	static int divCountByTwo(int n) {
		if(n%2>0) {
			return 0;
		}else {
			return 1+divCountByTwo(n/2);
		}
	}
	
	static int gcd(int a,int b) {
		if(a<b) {
			return gcd(b,a);
		}else if(b==0){
			return a;
		}else {
			return gcd(b,a%b);
		}
	}
	
	static int lcm(int a,int b) {
		return a*b/gcd(a,b);
	}
	
}