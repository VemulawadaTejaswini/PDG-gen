import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] direct = new int[N];
		String S = sc.next();
		for(int i=0;i<N;i++) {
			switch(S.charAt(i)) {
			case 'E':
				direct[i] = 1;
				break;
			case 'W':
				direct[i] = -1;
				break;
			default:
				System.out.println("Error");
				return;
			}
		}
		int ans = N;
		for(int i=0;i<N;i++) {
			int left = 0;
			int right = 0;
			for(int j=0;j<i;j++) {
				if(direct[j]==-1)
					left++;
			}
			for(int j=i+1;j<N;j++) {
				if(direct[j]==1)
					right++;
			}
			if(ans>left+right)
				ans = left+right;
		}
		System.out.println(ans);
	}
}
