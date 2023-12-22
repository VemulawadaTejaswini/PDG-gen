import java.util.Scanner;

class Main{





	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String ss = sc.next();
		String tt = sc.next();
		int[][] dp = new int[ss.length()+1][tt.length()+1];
		for(int i =0;i < ss.length();i++){
			for(int j = 0;j < tt.length();j++){
				if(ss.charAt(i) == tt.charAt(j)){
					dp[i+1][j+1] = dp[i][j] + 1; 
				}else{
					dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}

		int count = dp[ss.length()][tt.length()];
		StringBuilder sb = new StringBuilder();
		for(int i =ss.length()-1;i >=0 ;i--){

			if(count > dp[i][tt.length()]){
				
				count--;
				sb.append(ss.charAt(i));	
//				System.out.println(ss.charAt(i));

			}
		}
		String ans = sb.reverse().toString();
		System.out.println(ans);


	}
}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

