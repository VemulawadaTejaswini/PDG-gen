public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split("");
		String answer = "";
		for (int i = 0; i < line.length; i++) {
			switch (line[i]) {
			case "0":
			case "1":
				answer = answer + line[i];
				break;
			case "B":
				if (!(answer.equals(""))) {
					answer = answer.substring(0, answer.length() - 1);
				}
			}
		}
		System.out.println(answer);
	}
}
