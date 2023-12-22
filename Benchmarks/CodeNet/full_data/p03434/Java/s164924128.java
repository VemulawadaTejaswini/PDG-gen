import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = 0, b = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			list.add(scan.nextInt());
		}
		if(n%2==1)list.add(0);
		
		Collections.sort(list, Collections.reverseOrder());
		for(int i = 0; i < list.size(); i += 2){
			a += list.get(i);
			b += list.get(i+1);
		}
		
		System.out.println(a - b);
	}
}