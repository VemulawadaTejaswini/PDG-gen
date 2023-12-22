import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		List<String> list = new ArrayList<>(); 
		for(int i = 0; i < a; i++) {
			list.add(sc.next());
		}
		Collections.sort(list);
		StringBuilder val = new StringBuilder();
		for(int j = 0; j < list.size(); j++) {
			val.append(list.get(j));
		}
		System.out.println(val);
	}
}
