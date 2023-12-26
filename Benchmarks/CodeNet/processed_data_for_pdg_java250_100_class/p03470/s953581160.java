public class Main {
	public static void main(String[] args) {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		try(BufferedReader br = new BufferedReader(reader)) {
			int n = Integer.parseInt(br.readLine());
			Set<String> input = new HashSet<>();
			for(int i = 0; i < n; i++) {
				input.add(br.readLine());
			}
			System.out.println(input.size());
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
