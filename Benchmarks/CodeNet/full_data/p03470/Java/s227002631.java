import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		ArrayList<Integer> d = new ArrayList<Integer>();
		for(int i = 0; i < N; i ++) {
			d.add(stdIn.nextInt());
		}
		
		Collections.sort(d);
		Collections.reverse(d);
		
		int ans = 1;
		int base = d.get(0);
		
		for(int i = 1; i < d.size(); i ++) {
			if(d.get(i) < base) {
				base = d.get(i);
				ans ++;
			}else if(d.get(i) == base){
				// Do nothing
			}else {
				break;
			}
		}
		
		System.out.println(ans);
	}

}