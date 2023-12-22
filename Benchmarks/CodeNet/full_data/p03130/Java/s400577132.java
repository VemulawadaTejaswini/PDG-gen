import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bucket[] = new int[10];
		for(int i = 0; i < 6; i ++) {
			bucket[sc.nextInt()] ++;
		}
		boolean possible = true;
		for(int i = 0; i < bucket.length; i ++) {
			if(bucket[i] >= 3) {
				possible = false;
				break;
			}
		}
		System.out.println(possible ? "YES" : "NO");
	}
}