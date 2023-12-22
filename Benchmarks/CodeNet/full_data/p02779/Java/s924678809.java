import java.util.HashMap;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String anser = "YES";
 
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
 
		for (int i = 0; i < N; i++) {
			map.put(scan.nextInt(), i);
		}
 
		for (int i = 0; i < N; i++) {
			int size = map.size();
          	int a = 0;
         	while(a != null){
				a = map.remove(map.get(i));
            }
 
			if (size - 1 > map.size()) {
				anser = "NO";
				break;
			}
		}
		System.out.println(anser);
	}
 
}