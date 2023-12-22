import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Long H = sc.nextLong();
		long ans = 0;
		ArrayList<Long> lifeList = new ArrayList<>();
		lifeList.add(H);
		
		for(int i = 0; i < lifeList.size(); i++) {
			ans++;
			if(lifeList.get(i) == 1) {
				continue;
			}else {
				lifeList.add(lifeList.get(i) / 2);
				lifeList.add(lifeList.get(i) / 2);
			}
		}

		System.out.println(ans);
		sc.close();
	}
	
}