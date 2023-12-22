import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		List<String> sList = Arrays.asList(S.split(""));
		List<Integer> changeCntList = new ArrayList<>();

		for (int i=0; i<N-1; i++) {
			List<String> fHalfList = sList.subList(0, i);
			List<String> sHalfList = sList.subList(i+1, N);

			Long changeCnt = fHalfList.stream().filter(j -> "W".equals(j)).count()
					+ sHalfList.stream().filter(j -> "E".equals(j)).count();
			changeCntList.add(new Integer(changeCnt.toString()));
		}

		Optional<Integer> min = changeCntList.stream().min((a, b) -> a.compareTo(b));
		System.out.println(min.orElse(0));
	}
}

