import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		long m = sc.nextLong();
		List<Long> list = new ArrayList<>();
		// スペース区切りの整数の入力
		for(int i=0;i<n;i++){
			list.add(sc.nextLong());
		}
		long sum =0;
		for(int j=0;j<n;j++){
			for(int k=j;k<n;k++){
				sum+=isGoal(calcSum(list,j,k),m);
			}
		}
		
			System.out.println(sum);

	}

	public static long calcSum(List<Long> list ,int start,int end) {
		long sum=0;
		for(int i=start;i<=end;i++){
			sum+=list.get(i);
		}
		return sum;
	}

	public static long isGoal(long sum,long member) {
		return sum%member==0l?1l:0l;
	}
}