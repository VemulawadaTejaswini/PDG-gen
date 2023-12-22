import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(0));
		for(int i = 0; i < N; i++) {
			int l = sc.nextInt();
			if(!list.contains(l)) {
				list.add(l);
			}else{
				break;
			}
		}
		if(list.size() == N+1)System.out.println("Yes");
		else System.out.println("No");
	}
}