import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static Scanner sc;
	static int N, M;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;

		sc = new Scanner(in);

		N = sc.nextInt();
		M = sc.nextInt();
		int answer = 0;
		HashMap<Integer, HashSet<Integer>> data = new HashMap<>();
		int[][] fullData = new int[M][2];

		for(int i = 0; i < M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();

			if(data.get(a) == null){
				data.put(a, new HashSet<>());
			}
			data.get(a).add(b);

			if(data.get(b) == null){
				data.put(b, new HashSet<>());
			}
			data.get(b).add(a);

			fullData[i][0] = a;
			fullData[i][1] = b;
		}

		//for (Integer key : data.keySet()) {
			//for (Integer end : data.get(key)) {
		for(int i = 0; i < M; i++){
			int key = fullData[i][0];
			int end = fullData[i][1];
				//System.out.println(data);
//				HashMap<Integer, HashSet<Integer>> nextData = (HashMap<Integer, HashSet<Integer>>) data.clone();
				HashMap<Integer, HashSet<Integer>> nextData = new HashMap<>();
				for (Integer k : data.keySet()) {
					nextData.put(k, new HashSet<>(data.get(k)));
				}
				nextData.get(key).remove(end);
				nextData.get(end).remove(key);
				//System.out.println(data);
				//System.out.println(nextData);
				if(check(nextData, key, end) == false){
					answer++;
				}else{
					//System.out.println("true");
				}
				//System.out.println("");
			//}
		}
		System.out.println(answer);


	}

	public static boolean check(HashMap<Integer, HashSet<Integer>> d, int now, int end){
		if(now == end){
			return true;
		}
		boolean ans = false;
		for (Integer i : d.get(now)) {
			HashMap<Integer, HashSet<Integer>> nextData = new HashMap<>();
			for (Integer k : d.keySet()) {
				nextData.put(k, new HashSet<>(d.get(k)));
			}

			nextData.get(now).remove(i);
			nextData.get(i).remove(now);
			//System.out.println(now + "\t" + i + "\t" +end + "\t" +nextData);
			ans = check(nextData, i, end);

			if(ans == true){
				break;
			}

		}
		return ans;
	}
}