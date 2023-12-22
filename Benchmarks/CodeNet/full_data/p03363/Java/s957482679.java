import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
/*		List<Integer> inputList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			inputList.add(Integer.parseInt(sc.next()));
		}*/
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;

		try {
			s = new String(in.readLine());
			String[] inputList = s.split(" ");
			int ans = 0;
			for (int i=0; i<n; i++) {
				int sum = 0;
				for(int l=i; l<n; l++) {
					sum += Integer.parseInt(inputList[l]);
					if (sum == 0) {
						ans++;
					}
				}
			}
			System.out.println(ans);

		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}