import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//要素数受け取り
		int n = sc.nextInt();
		//積みかねの合計値
		int tmp1;
		int tmp2;
		int tmp;
		Integer [] list = new Integer[n];
		for(int i = 0; i < n; i ++){
			list[i] = sc.nextInt();
		}
		Arrays.sort(list);
		List<Integer> Sortlist = new ArrayList<>(Arrays.asList(list));
		
		for(int t = n -1; 0 < t  ; t = t -1){
			tmp1 = Sortlist.get(t);
			tmp2 = Sortlist.get(t - 1);
			if(tmp1 == tmp2){
				Sortlist.remove(t);
			}
		}
		System.out.println(Sortlist.size());
	}
}
