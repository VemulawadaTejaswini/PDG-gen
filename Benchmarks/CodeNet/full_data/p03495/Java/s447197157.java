import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int[] firstLine = Stream.of(stdin.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] elements = Stream.of(stdin.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int maxNumsOfType = firstLine[1];
		HashMap<Integer, Integer> numCounter = new HashMap<Integer, Integer>();
		Arrays.stream(elements).forEach(num -> {
			if (!numCounter.containsKey(num)) numCounter.put(num,1);
			else numCounter.put(num, numCounter.get(num)+1);
		});
		//System.out.println(numCounter);
		int numsOfType = 0;
		int changedSum = 0;
		for(int i = 0; i < numCounter.keySet().size(); i++) {
			numsOfType++;
		}
		while(numsOfType > maxNumsOfType) {
			int minNum = minKey(numCounter);
			changedSum += numCounter.get(minNum);
			numCounter.remove(minNum);
			numsOfType--;
		}
		System.out.println(changedSum);
	}
	
	public static int minKey(HashMap<Integer, Integer> hashMap) {
		int[] min = { Integer.MAX_VALUE , Integer.MAX_VALUE };
		for (int key: hashMap.keySet()){
			int value = hashMap.get(key);
			if(min[1] > value) {
				min[0] = key;
				min[1] = value;
			}
		}
		return min[0];
	}
}
