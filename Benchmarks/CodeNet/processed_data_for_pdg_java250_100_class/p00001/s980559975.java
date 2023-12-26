public class Main {
	public static void main(String[] args) throws IOException {
		List<Integer> hills = new ArrayList<Integer>();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		for(int i=0; i<10; ++i){
			hills.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(hills);
		System.out.println(hills.get(9));
		System.out.println(hills.get(8));
		System.out.println(hills.get(7));
	}
}
