import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			list.add(a);
			if(map.containsKey(a)){
				map.put(a, map.get(a) + b);
			}else{
				map.put(a, b);
			}
		}

		list.sort(Comparator.naturalOrder());

		for(int i = 0; i < list.size(); i++){
			int num = list.get(i);
			k -= map.get(num);
			if(k <= 0){
				System.out.println(num);
				break;
			}
		}

	}

}

