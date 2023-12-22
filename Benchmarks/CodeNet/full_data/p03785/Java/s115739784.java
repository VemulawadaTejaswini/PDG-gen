
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = in.nextInt();
		int k = in.nextInt();
		ArrayList<Integer> t = new ArrayList<>();

		for(int i=0; i<n; i++){
			t.add(in.nextInt());
		}
		Collections.sort(t);

		int crew = 0;
		int i = 1;
		int count = 1;
		while(t.size()>0){
			while(t.get(0)+k >= t.get(i-1) && crew<c &&i<t.size()){
				i++;
				crew++;
			}
			count++;
			for(int j=0; j<i; j++){
				t.remove(0);
			}
			i=1;
			crew=0;
		}
		System.out.println(count);
	}

}
