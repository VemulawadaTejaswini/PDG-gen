public class Main {
	public static void main(String[] args) {
		int n = 0, m = 0;
		int b = 0;
		int temp1 = 0;
		int temp2 = 0;
		int sum = 0;
		int count1 = 0;
		int count2 = 0;
		String str;
		ArrayList<String> st = new ArrayList<String>(); 
		ArrayList<Integer> parse = new ArrayList<Integer>(); 
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt(); 
		m = scan.nextInt();
		int matrix[][] = new int[n][m];
		int vector[] = new int[m];
		int anser[] = new int[n];
		for (int a = 0; a < n; ++a) { 
			for (int t = 0; t < m; ++t) { 
				st.add(scan.next());
			}
			for (int p = count1; p < st.size(); ++p) { 
				str = st.get(p);
				temp1 = Integer.parseInt(str);
				parse.add(temp1);
			}
			count1 += m;
		}
		for (int k = 0; k < n; ++k) { 
				matrix[k][l] = parse.get(count2++);
			}
		}
		for (int i = 0; i < m; ++i) {
			b = scan.nextInt();
			vector[i] = b;
		}
			for (int d = 0; d < n; ++d) {
				for (int f = 0; f < m; ++f) {
					sum += matrix[d][f] * vector[f];
				}
				anser[d] = sum;
				System.out.println(anser[d]);
				sum = 0;
		}
	}
}
