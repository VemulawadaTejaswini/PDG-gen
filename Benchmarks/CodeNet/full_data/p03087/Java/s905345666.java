vimport java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), Q = sc.nextInt();
		String S = sc.next();
		for (int i=0; i<Q; i++){
			int count = 0;
			int l = sc.nextInt(), r = sc.nextInt();
			String sub = S.substring(l-1, r);
			for (int j=0; j<sub.length()-1; j++){
				if (sub.charAt(j)=='A' && sub.charAt(j+1)=='C'){
					count++;
				}
			}
			System.out.println(count);
		}

	}

}