import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> numberList = new ArrayList<Integer>();
		int count = sc.nextInt();
		for(int i =0;i < count;i++) {
			numberList.add(sc.nextInt());
		}

		int breakCount = 0;
		int index = 1;
		while(true) {
			if(numberList.isEmpty()) {
				break;
			}
			if(index > count) {
				break;
			}
			if(numberList.get(index -1) == index) {
				index++;
				continue;
			}else {
				numberList.remove(index -1);
				count--;
				breakCount++;
				continue;
			}
		}
		if(numberList.isEmpty()) {
			System.out.println("-1");
		}else {
			System.out.println(breakCount);
		}
	}
}