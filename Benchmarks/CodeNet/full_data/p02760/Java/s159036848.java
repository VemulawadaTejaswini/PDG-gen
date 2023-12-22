import java.util.ArrayList;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] A1 = new int [3];
		int[] A2 = new int [3];
		int[] A3 = new int [3];
		
		A1[0] = sc.nextInt();
		A1[1] = sc.nextInt();
		A1[2] = sc.nextInt();
		
		A2[0] = sc.nextInt();
		A2[1] = sc.nextInt();
		A2[2] = sc.nextInt();
		
		A3[0] = sc.nextInt();
		A3[1] = sc.nextInt();
		A3[2] = sc.nextInt();
		
		int N = sc.nextInt();
		ArrayList<Integer> nums = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			nums.add(sc.nextInt());
		}

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 3; j++) {
				if(nums.get(i) == A1[j]) {
					A1[j] = -1;
				}
				if(nums.get(i) == A2[j]) {
					A2[j] = -1;
				}
				if(nums.get(i) == A3[j]) {
					A3[j] = -1;
				}
			}
		}

		boolean ans = false;
		
		if(A1[0]==-1 && A1[1]==-1 && A2[2]==-1) {
			ans = true;
		}
		if(A2[0]==-1 && A2[1]==-1 && A2[2]==-1) {
			ans = true;
		}
		if(A3[0]==-1 && A3[1]==-1 && A3[2]==-1) {
			ans = true;
		}
		
		if(A1[0]==-1 && A2[0]==-1 && A3[0]==-1) {
			ans = true;
		}
		if(A1[1]==-1 && A2[1]==-1 && A3[1]==-1) {
			ans = true;
		}
		if(A1[2]==-1 && A2[2]==-1 && A3[2]==-1) {
			ans = true;
		}
		
		if(A1[0]==-1 && A2[1]==-1 && A3[2]==-1) {
			ans = true;
		}
		if(A1[2]==-1 && A2[1]==-1 && A3[0]==-1) {
			ans = true;
		}
		
		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();
	}
	
}