import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		List<Integer> nLst = new ArrayList<Integer>();
		int max = 0;
		int preNum = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			nLst.add(sc.nextInt());
		}
		for (Integer num : nLst) {
			if(preNum >= num) {
				count++;
				if(max < count) {
					max = count;
				}
			} else {
				count = 0;
			}
			preNum = num;
		}
		System.out.println(max);
	}
}