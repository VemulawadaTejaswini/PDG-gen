import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] S = new String[n];
		char c;
		int[][] count = new int[n][26];

		S[0]=scan.nextLine();
		for(int i =0;i<n;i++){
			S[i]=scan.nextLine();
		}

		for(int i =0;i<n;i++){
			for(int j =0;j<S[i].length();j++){
			c = S[i].charAt(j);
			count[i][c-'a']++;
			}
		}

		int[] min = new int[26];

		for(int i =0;i<26;i++){
			min[i]=50;
			for(int j =0;j<n;j++){
				if(count[j][i] < min[i]){
					min[i]=count[j][i];
				}
			}
		}

		c = 'a';
		for(int i=0;i<26;i++){
			for(int j=0;j<min[i];j++){
				System.out.print(c);
			}
			c++;
		}
		System.out.println("");

	}

}
