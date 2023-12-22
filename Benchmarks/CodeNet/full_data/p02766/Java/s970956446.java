import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int baseNum = sc.nextInt();
		List<Integer> list = new ArrayList<>();

		while(num > baseNum){
			list.add(num%baseNum);
			num = num/baseNum;
			if (num < baseNum) {
				continue;
			}
		}
		if(num == baseNum){
			System.out.println(list.size()+2);
		}else if(num > baseNum){
			System.out.println(list.size()+1);
		}
		System.out.println(list.size()+1);
		sc.close();
	}
}