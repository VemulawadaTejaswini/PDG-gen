import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] set = new int[N];
		// 後ろの日付から順に、高いのから入れていく
		long tmp;
		List<Long> list = new ArrayList<>();
		for(int i=0;i<N;i++){
			tmp = sc.nextLong()*1000000 + sc.nextLong();
			list.add(tmp);
		}
		Collections.sort(list);
		int result = 0;
		for(int i=1;i<=M;i++){
			long max = 0;
			int maxj = 0;
			for(int j=list.size()-1;j>0;j--){
				if(list.get(j)/1000000 <= i){
					if(list.get(j)%1000000>max){
						max=list.get(j)%1000000;
						maxj=j;
					}
				}
			}
			result+=max;
			list.remove(maxj);
		}
		System.out.println(result);
	}
}