public class Main {
	public static void main(String[] args) throws IOException {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			final String inputLine = br.readLine();
			final String[] inputNumber = inputLine.split(" ");
			final Integer a = Integer.valueOf(inputNumber[0]);
			final Integer b = Integer.valueOf(inputNumber[1]);
			if(a < b) {
				System.out.println("a < b");
			}
			if(a > b) {
				System.out.println("a > b");
			}
			if(a.equals(b)) {
				System.out.println("a == b");
			}
		}
	}
}
