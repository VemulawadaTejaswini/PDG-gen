import java.util.Scanner;
public class Main {
	public static void main(String args[]){//double 处理果盘
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(),sum=0;
		int[] num = new int[n];
		for (int i=0;i<n;i++){
			num[i] = in.nextInt();
		}
		for (int i =0;i<n;i++){
			for (int j=i+1;j<n;j++){
				for (int k=j+1;k<n;k++){
					if (num[i]+num[j]>num[k] && num[i]+num[k]>num[j] && num[k]+num[j]>num[i]){
						++sum;
					}
				}
			}
		}
		System.out.println(sum);
	}
}