import java.util.Arrays;
import java.util.Scanner;

class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] even = new int[100001];
		int[] odd = new int[100001];
		
		int evenMaxIndex = 0;
		int evenMaxCount = 0;
		int oddMaxIndex = 0;
		int oddMaxCount = 0;
		for (int i = 1; i <= N; i++) {
			int num = sc.nextInt();
			if (i % 2 == 0) {
				int tmp = even[num];
				tmp++;
				even[num] = tmp;
				
				if (Math.max(evenMaxCount, tmp) == tmp) {
					evenMaxIndex = num;
					evenMaxCount = tmp;
				}
			} else {
				int tmp = odd[num];
				tmp++;
				odd[num] = tmp;
				
				if (Math.max(oddMaxCount, tmp) == tmp) {
					oddMaxIndex = num;
					oddMaxCount = tmp;
				}
			}
		}
		
		if (evenMaxIndex == oddMaxIndex) {
			Arrays.sort(even);
			Arrays.sort(odd);
			oddMaxCount = Math.max(even[even.length-2], odd[odd.length-2]);
		}
		
		int ans = N - (evenMaxCount + oddMaxCount);
		
		System.out.println(ans);
	}
	
}