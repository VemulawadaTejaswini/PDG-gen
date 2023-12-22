import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		// List<Long> list = new ArrayList<>();
		  List<List<Integer>> numList = new ArrayList<>();
		  List<List<Integer>> checkList = new ArrayList<>();
		// スペース区切りの整数の入力
		for(int i=0;i<m;i++){
		List<Integer> list = new ArrayList<>();
			list.add(sc.nextInt());
			list.add(sc.nextInt());
			numList.add(i,list);
		}
		for(int i=0;i<q;i++){
		List<Integer> list = new ArrayList<>();
			list.add(sc.nextInt());
			list.add(sc.nextInt());
			checkList.add(i,list);
			int count =0;
			for(int j=0;j<m;j++){
				List<Integer> kukanList = numList.get(j);

			// System.out.println(kukanList.get(0)+"-"+kukanList.get(1)+" kukan");
			// System.out.println(list.get(0)+"-"+list.get(1)+" list");
				if(kukanList.get(0)>=list.get(0)
					&&kukanList.get(1)<=list.get(1)){
			// System.out.println(kukanList.get(0)+"-"+kukanList.get(1)+" add");
					count++;
				}
			}

			System.out.println(count);


		}
		//区間の最初の値と等しいか小さく、とかだと2回for文回る
		//

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