import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);
		int[][] sum = new int[10][10];
		for(int i=0;i<sum.length;i++){
			Arrays.fill(sum[i], 0);
		}

		int ans =0;


		for(int i=1;i<=N;i++){
			int keta = String.valueOf(i).length();
			int head = String.valueOf(i).charAt(0)-'0';
			int tail = String.valueOf(i).charAt(keta-1)-'0';

			for(int k=1;k<=9;k++){
				if(head == k && tail == k){
				sum[keta][1]++;
				}
			}
		}
		for(int i=1;i<sum.length;i++){
			sum[1][i] = sum[i][1];
		}

		for(int i=2;i<sum.length;i++){
			for(int k=2;k<sum[i].length;k++){
				sum[i][k] = sum[1][k]*sum[i][1];
			}
		}

		for(int i=1;i<sum.length;i++){
			for(int k=1;k<sum[i].length;k++){
				ans +=sum[i][k];
			}
		}

		System.out.println(ans);

//		for(int i=1;i<=N;i++){
//			int keta = String.valueOf(i).length();
//			int head = String.valueOf(i).charAt(0)-'0';
//			int tail = String.valueOf(i).charAt(keta-1)-'0';
//
//			for(int k=1;k<=N;k++){
//				int keta2 = String.valueOf(k).length();
//				int head2 = String.valueOf(k).charAt(0)-'0';
//				int tail2 = String.valueOf(k).charAt(keta2-1)-'0';
//
//				if(head == tail2 && tail == head2){
//					ans++;
//					sum[keta][keta2]++;
//				}
//			}
//		}
//
//		for(int i=1;i<sum.length;i++){
//			for(int k=1;k<sum[i].length;k++){
//				System.out.printf("%5d ",sum[i][k]);
//			}
//			System.out.println("");
//		}


	}


}
