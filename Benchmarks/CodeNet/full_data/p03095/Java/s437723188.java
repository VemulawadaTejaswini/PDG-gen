import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Map<Character, Double> map = new HashMap<>();
		String target = sc.next();
		for(int i=0; i < target.length(); i++) {
			char str = target.charAt(i);
			if(map.containsKey(str)) {
				map.put(str, map.get(str) + (double)1);
			}else {
				map.put(str, (double)1);
			}
		}
		List<Double> numList = new ArrayList<>();
		for(Entry<Character, Double> entry : map.entrySet()) {
			double value = entry.getValue();
			numList.add(value);
		}
		double tempAns = 1;
		for(double eachNum : numList) {
			tempAns = tempAns * (eachNum + 1);
		}
		System.out.println((long)((tempAns - 1) % 1000000007));
		sc.close();
	}
}