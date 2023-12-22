import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		int ans = 0;
		for(int i = 0; i < N; i++)
			a.add(sc.nextInt());
		Collections.sort(a);
		List<Integer> b = new ArrayList<>(new HashSet<>(a));
		for(int i = 0; i < b.size(); i++){
			int min = b.get(i);
			if(min > a.size()) {
				ans += a.size();
				break;
			}
			else {
				int next = a.indexOf(b.get(i+1));
				if(a.get(min-1) == min) {
					ans += next - min;
				}
				else
					ans += next;
				a.subList(0,next).clear();
			}
		}
		System.out.println(ans);

	}

}