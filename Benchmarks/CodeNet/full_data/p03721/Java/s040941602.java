import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for (int i = 0; i < n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int j = 0; j < b; j++){
				array.add(a);				
			}
		}
		
		for (int i = 0; i < k; i++){
			int min = 100001;
			int mark = 0;
			for (int j = 0; j < array.size(); j++){
				if (array.get(j) <= min){
					min = array.get(j);
					mark = j;
				}
			}
			array.remove(mark);
		}

		int min = 100001;
		for (int i = 0; i < array.size(); i++){
			if (array.get(i) <= min){
				min = array.get(i);
			}
		}
		System.out.println(min);
	}
}
