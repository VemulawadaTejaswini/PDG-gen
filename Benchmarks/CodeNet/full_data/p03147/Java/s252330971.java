import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),count=0;
		int[] height = new int[n];
		for(int i=0;i<n;i++) height[i]=sc.nextInt();
		while(!all_zero(n,height)) {
			for(int i=0;i<n;i++) {
				if(i==0 && height[0]!=0) count++;
				if(i!=0 && height[i]!=0 && height[i-1]==0) count++;
			}
			for(int i=0;i<n;i++) {
				if(height[i]!=0) height[i]--;
			}
		}
		System.out.println(count);
	}

	static boolean all_zero(int n, int[] array) {
		for(int i=0;i<n;i++) {
			if(array[i]!=0) return false;
		}
		return true;
	}
}