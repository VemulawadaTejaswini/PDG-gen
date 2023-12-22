import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		List<Integer> dupList = new ArrayList<>();


		for (int i=1; i<N; i++) {
			int dupNum=0;
			List<String> fHalfList = new ArrayList<String>(new HashSet<>(Arrays.asList(S.substring(0,i).split(""))));
			List<String> sHalfList = new ArrayList<String>(new HashSet<>(Arrays.asList(S.substring(i,N).split(""))));

			for (int j=0; j<fHalfList.size(); j++) {
				if (sHalfList.contains(fHalfList.get(j))) {
					dupNum++;
				}
			}
			dupList.add(dupNum);
		}

		Optional<Integer> max = dupList.stream().max((a, b) -> a.compareTo(b));

		System.out.println(max.orElse(0));
	}
}

