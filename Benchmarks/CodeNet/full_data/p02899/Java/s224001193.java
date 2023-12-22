import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Map<Integer, Integer> mMap = new HashMap<Integer,Integer>();
		for(int i = 0; i < N; i++) {
			int h = sc.nextInt();
			mMap.put(h,i+1);
		}
		ArrayList<Integer> Key = new ArrayList<>(mMap.keySet());
		Collections.sort(Key);

        for (Integer nKey : mMap.keySet()){
            System.out.print(mMap.get(nKey)+" ");
        }
	}

}