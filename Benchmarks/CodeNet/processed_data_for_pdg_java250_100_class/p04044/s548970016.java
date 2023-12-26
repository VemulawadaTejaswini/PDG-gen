public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[]=br.readLine().split(" ");
		int n =Integer.parseInt(line[0]);
		String [] sort =new String[n];
		for (int i = 0; i < sort.length; i++) {
			sort[i] = br.readLine();
		}
		Arrays.sort(sort);
		StringBuilder answer =new StringBuilder();
		for(int i=0;i<sort.length;i++) {
		answer.append(sort[i]);
		}
		System.out.println(answer);
	}
}
