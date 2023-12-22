import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new ArrayList<>();
		
		int sum = 0;
		
		int takoyaki = sc.nextInt();
		
		for(int i = 1; i <= takoyaki; i++) {
			int delicious = sc.nextInt();
			list.add(delicious);
		}
		
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list.size(); j++) {
				if( !(i == j)) {
					int sum += list.get(i) * list.get(j);
				}
			}
		}
	}
}
