import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> sheetInfo = new ArrayList<Integer>();
		for(int i = 0;i < n;i++) {
			sheetInfo.add(sc.nextInt());
		}
		Collections.sort(sheetInfo);
		int answer =0;
		int numberCount = 1;
		int beforeNumber = sheetInfo.get(0);
		for(int i=1;i < n;i++) {
			if(beforeNumber == sheetInfo.get(i)) {
				numberCount++;
				if(i == n-1) {
					if(numberCount %2 ==1) {
						answer++;
					}
				}
			}else {
				if(numberCount %2 ==1) {
					answer++;
				}
				numberCount = 1;
				beforeNumber = sheetInfo.get(i);
				if(i == n-1) {
					answer++;
				}
			}
		}

		System.out.println(answer);
	}
}