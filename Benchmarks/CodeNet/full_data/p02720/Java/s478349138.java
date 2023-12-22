import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		List<Long> list = new ArrayList<>();
		for(long i=1; i<=9; i++) list.add(i);
		List<Long> tmp = new ArrayList<>(list);
		while(true){
			if(k <= list.size()){
				System.out.println(list.get(k-1));
				break;
			}
			k -= list.size();
			list.clear();
			for(Long i: tmp){
				for(int j= -1; j<=1; j++){
					long d = i%10 + j;
					if(d<0 || d>9) continue;
					list.add(i*10+d);
				}
			}
			tmp = new ArrayList<>(list);

		}
	}
}
