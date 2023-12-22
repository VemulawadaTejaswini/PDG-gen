
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> mt = new ArrayList<Integer>();
		int n = Integer.parseInt(sc.next());
		int count = 0;
		for(int i =0;i<n;i++) {
			mt.add(Integer.parseInt(sc.next()));
		}
		for(int j =0;j<n;j++) {
			List<Integer> sbList = mt.subList(0, j-1);
			int max = Collections.max(sbList);
			if(max==mt.get(j)){
				count++;
			}
		}
		System.out.println(count);
	}

}
