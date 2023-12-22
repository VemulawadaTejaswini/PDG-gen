import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		int[] firstLine = Stream.of(stdin.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] elements = Stream.of(stdin.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int balls = firstLine[0];
		int maxNumsOfType = firstLine[1];
		int[] cntNums = new int[balls+1];
		Arrays.fill(cntNums, 0);
		int answer = 0;
		for(int num: elements) cntNums[num]++;
		Arrays.sort(cntNums);
		for(int i = 0;i < balls + 1 - maxNumsOfType;i++) answer += cntNums[i];
		System.out.println(answer);
	}
}