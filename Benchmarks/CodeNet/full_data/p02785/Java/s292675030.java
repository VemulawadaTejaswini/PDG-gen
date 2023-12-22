import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int enemy = sc.nextInt();
		int skill = sc.nextInt();
		
		long count = 0;
		
		if(enemy <= skill) {
			System.out.println(0);
			System.exit(0);
		}
		
		ArrayList<Long> heart = new ArrayList<>();
		
		for(int i = 0; i < enemy;i++) {
			heart.add(sc.nextLong());
		}
		Collections.sort(heart);
		Collections.reverse(heart);
		
		for(int i = 0; i < skill;i++) {
			heart.remove(0);
		}
		
		for(int i = 0; i < heart.size();i++) {
			count += heart.get(i);
		}
		System.out.println(count);

	}

}
