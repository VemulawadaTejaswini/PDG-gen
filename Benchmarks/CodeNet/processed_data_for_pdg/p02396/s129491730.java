public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			for(int input_i = 0; input_i <= 10000; input_i++) {
				Integer num = Integer.valueOf(Integer.parseInt(br.readLine()));
				data.add(num);
				if(data.get(input_i) == Integer.valueOf(0)) {
					break;
				}
			}
			for (int case_j = 0; case_j < (data.size() - 1); case_j++) {
				System.out.println("Case " + (case_j + 1) + ": " + data.get(case_j));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
