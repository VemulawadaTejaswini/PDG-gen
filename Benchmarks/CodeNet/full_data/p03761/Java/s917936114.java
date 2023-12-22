import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); in.nextLine();
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		for( int i = 0; i < n; i++ ) {
			al.add(new ArrayList<Integer>());
			for( int j = 0; j < 26; j++ ) al.get(i).add(0);
		}
		for( int i = 0; i < n; i++) {
			String temp = in.nextLine();
			for( int j = 0; j < temp.length(); j++ ) {
				int ind = (int)temp.charAt(j)-'a';
				int curr = al.get(i).get(ind);
				al.get(i).set(ind,curr+1);
			}
		}
		int[] alph = new int[26];
		Arrays.fill(alph, Integer.MAX_VALUE);
		for( int i = 0; i < n; i++ ) {
			for( int j = 0; j < 26; j++ ) {
				alph[j] = Math.min(alph[j],al.get(i).get(j));
			}
		}

		StringBuilder sb = new StringBuilder();
		for( int i = 0; i < alph.length; i++ ) {
			for( int j = 0; j < alph[i]; j++ ) {
				sb.append((char)(i+'a'));
			}
		}

		System.out.println(sb.toString());
		//System.out.println(Arrays.toString(alph));

		// for( int i = 0; i < n; i++ ) {
		// 	for( int j = 0; j < 5; j++ ) {
		// 		System.out.print(al.get(i).get(j)+" ");
		// 	}
		// 	System.out.println();
		// }
	}	
}