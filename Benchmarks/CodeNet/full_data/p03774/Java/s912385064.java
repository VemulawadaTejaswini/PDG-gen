import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		List<String> divisor = new ArrayList<>();
		int[] in = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//		int x = Integer.parseInt(sc.next());
//		int S = Integer.parseInt(sc.next());
//		String[] S = sc.next().split("");
//		String s = sc.next();
		
		List<List<Long>> studentCoordinateList = new ArrayList<>();
		List<List<Long>> pointCoordinateList = new ArrayList<>();
		
		for (int i = 0; i < in[0]; i++) {
			studentCoordinateList.add(getInputValue(sc));
		}
		for (int i = 0; i < in[1]; i++) {
			pointCoordinateList.add(getInputValue(sc));
		}
		
		List<List<Long>> indexList = new ArrayList<>();
		for (int i = 0; i < in[0]; i++) {
			List<Long> tmpList = new ArrayList<>();
			
			for (int j = 0; j < in[1]; j++) {
				long val = 0;
				for (int k = 0; k < 2; k++) {
					val += Math.abs(studentCoordinateList.get(i).get(k) - pointCoordinateList.get(j).get(k));
				}
				tmpList.add(val);
			}
			indexList.add(tmpList);
		}
		
		List<Long> countList = new ArrayList<>();
		for (List<Long> index : indexList) {
			long count = 1;
			long min = Long.MAX_VALUE;
			
			for (int i = 0; i <index.size(); i++) {
				
				long diff = Math.abs(0 - index.get(i));	
				if (diff < min) {
					count = i+1;
					min = diff;
				}
			}
			countList.add(count);
		}
		
		System.out.println(countList);		
	}
	
	private static List<Long> getInputValue(Scanner sc) {
		List<Long> tmp = new ArrayList<>();
		Stream.of(sc.nextLine().split(" ")).mapToLong(Long::parseLong).forEach(n -> tmp.add(n));
		return tmp;
	}
}
