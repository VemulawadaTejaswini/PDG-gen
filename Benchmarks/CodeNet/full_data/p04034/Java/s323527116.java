import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bf.readLine().split(" ");
		int N = Integer.parseInt(data[0]),M = Integer.parseInt(data[1]);
		int x,y;
		int[]can;
		HashMap<Integer, int[]> Hm = new HashMap<>(N);
		HashSet<Integer> posibles = new HashSet<>();
		for(int i=1; i<=N; i++){
			int[] cant = {1};
			Hm.put(i, cant);
		}
		posibles.add(1);
		for(int i =0; i<M; i++){
			data = bf.readLine().split(" ");
			x = Integer.parseInt(data[0]);
			y = Integer.parseInt(data[1]);
			can = Hm.get(x);
			can[0]=can[0]-1;
			if(posibles.contains(x)){
				posibles.add(y);
			}
			if(can[0]==0){
				posibles.remove(x);
			}
			can = Hm.get(y);
			can[0]++;
		}
		System.out.println(posibles.size());
	}
}
