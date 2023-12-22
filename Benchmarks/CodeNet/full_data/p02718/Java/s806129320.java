import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] c = new int[n];
		int voteSum = 0;

		for(int i = 0; i < n; i++){
			c[i] = sc.nextInt();
			voteSum += c[i];
		}
		for(int i = 0; i < n-1; i++){
			for(int j = 1; j < n; j++){
				if(c[i] < c[j]){
					int box = c[i];
					c[i] = c[j];
					c[j] = box;
				}
			}
		}

		if(c[m - 1] < (voteSum/(4 * m))){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}