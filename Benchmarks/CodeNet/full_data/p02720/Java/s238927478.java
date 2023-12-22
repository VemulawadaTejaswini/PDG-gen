import java.util.Scanner;

public class Main {
	public static boolean check(int n) {
		String s= Integer.toString(n);
		for(int i=0; i<s.length()-1; i++) {
			if(Math.abs(s.charAt(i)-s.charAt(i+1))>1) return false;
		}
		return true;
	}
	
	
	public static int[] N=new int[1000001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K;
		N[0]=0;
		int j=1;
		for(int i=1; i<=50000000; i++) {
			if(check(i)) {
				N[j] =i;
				j++;
			}
		}
		
		K=sc.nextInt();
//		for(int i=0; i<100; i++) {
//			System.out.print(N[i]+" ");
//		}
		System.out.println(N[K]);
		
	}
}