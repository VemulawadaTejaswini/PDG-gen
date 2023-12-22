import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> param = new ArrayList<String>();

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				num.add(sc.nextInt());
			} else {
				param.add(sc.nextLine());
			}
		}
		Method(num, param);
	}
	
	static void Method(ArrayList<Integer> num, ArrayList<String> param) {
		int count = 0;

		if(num.get(0) == 7) count += 7;
		if(num.get(0) == 5) count += 5;
		
		if(num.get(1) == 7) count += 7;
		if(num.get(1) == 5) count += 5;
		
		if(num.get(2) == 7) count += 7;
		if(num.get(2) == 5) count += 5;
		
		if(count == 17){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}