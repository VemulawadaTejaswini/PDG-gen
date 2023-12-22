import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		
		int count = 0;
		int mm = A[0];
		for(int i=1;i<N;i++) {
			if (!(mm == A[i]-1)) {
				count++;
				mm = Math.min(mm, A[i]);
			}else {
				mm = A[i];
			}
		}
		
		boolean judge = false;
		for(int i=0;i<N;i++) {
			if(A[i] == 1) {
				judge = true;
				break;
			}
		}
		if(!(judge)) {
			System.out.println(-1);
		}else{
			System.out.println(count);
		}
	}
}