import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int N = sn.nextInt();
		int L = sn.nextInt();
		List<String> S = new ArrayList<String>();
		for(int i = 0;i < N;++i){
			String str = sn.next();
			S.add(str);
		}
		Collections.sort(S);
		for(String str : S){
			System.out.print(str);
		}
		System.out.println();
	}
}
