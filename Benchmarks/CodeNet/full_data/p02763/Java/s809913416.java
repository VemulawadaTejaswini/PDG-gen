import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		String[] s1 = new String[n];

		for (int i=0; i<n; i++ ) {
			s1[i] = String.valueOf(s.charAt(i));
		}

		int q = sc.nextInt();

		for (int i=0; i<q; i++ ) {
			int tp = sc.nextInt();
			if ( tp == 1 ) {
				int ps1 = sc.nextInt()-1;
				String sf1 = sc.next();
				s1[ps1] = sf1;
			} else {
				int ps2 = sc.nextInt()-1;
				int ps3 = sc.nextInt();
				List<String> la = new ArrayList<String>(Arrays.asList(Arrays.copyOfRange(s1, ps2, ps3)));
				List<String> lb = new ArrayList<String>(new HashSet<>(la));

				System.out.println(lb.size());
			}
		}
	}
}