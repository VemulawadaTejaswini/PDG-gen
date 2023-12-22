import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int k = scan.nextInt();
		List<Integer> list1 = new ArrayList<>();
		//List<Integer> list2 = new ArrayList<>();
		for(int i=a;i<=b;i++) {
			if(i<=a+k-1) {
				list1.add(i);
			}else {
				break;
			}
		}
		for(int i=b;i>=a;i--) {
			if(i>=b-k+1) {
				list1.add(i);
			}else {
				break;
			}
		}
		//System.out.println(list1);

		List<Integer> list2 = new ArrayList<>(new HashSet<>(list1));
		Collections.sort(list2);
		//System.out.println(list2);
		for(int i : list2) {
			System.out.println(i);
		}


	}

}
