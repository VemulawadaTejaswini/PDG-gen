
import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Map<Integer,Integer>cnt = new HashMap<>();
		List<Integer> a = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int v=sc.nextInt();
			cnt.put(v, cnt.containsKey(v) ? cnt.get(v)+1 : 1);
			a.add(v);
		}
		Collections.sort(a);
		a = a.stream().distinct().collect(Collectors.toList());
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=a.size()-1; i>=0; i--) {
			int v=a.get(i);
			if(cnt.get(v) >= 4) {
				ans.add(v);
				ans.add(v);
			}else if(cnt.get(v)>=2) {
				ans.add(v);
			}
			if(ans.size()>=2) break;
		}
		if(ans.size()<1){
			System.out.println(0);
		}else {
			System.out.println(ans.get(0)*ans.get(1));
		}
		sc.close();
	}





}
