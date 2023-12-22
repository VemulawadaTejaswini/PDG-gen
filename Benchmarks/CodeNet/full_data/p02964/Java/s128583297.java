import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		StringBuilder A = new StringBuilder();
		A.append(sc.next());
		Set<Integer> type = new HashSet<>();
		type.add(Character.getNumericValue(A.charAt(0)));
		for(int i = 1; i < N; i++) {
			String a = sc.next();
			if(a.charAt(0) == (A.charAt(A.length()-1)) )
				A.substring(A.length()-1);
			else {
				A.append(a);
				type.add(Integer.parseInt(a));
			}
		}
		int M = type.size();
		K %= (M+1);
		StringBuilder ans = new StringBuilder();
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < K; i++) {
			for(int j = 0; j < A.length(); j++) {
				if(set.contains(Character.getNumericValue((A.charAt(j))))) {
					int t = ans.indexOf(String.valueOf(A.charAt(j)));
					for(int k = t; k < ans.length(); k++)
						set.remove(Character.getNumericValue((ans.charAt(k))));
					ans.delete(t, ans.length());
				}
				else {
					set.add(Character.getNumericValue((A.charAt(j))));
					ans.append(A.charAt(j));
				}
			}
		}
		for(int i = 0; i < ans.length(); i++)
			System.out.print(ans.charAt(i)+ " ");
		System.out.println();

	}

}