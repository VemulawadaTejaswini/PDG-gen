public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
			input = br.readLine();
			br.close();
		} catch (IOException e) {
		}
		String[] inputs = input.split(" ");
		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);
		int c = Integer.parseInt(inputs[2]);
		if(a > b){
			int tmp = a;
			a = b;
			b = tmp;
		}
		if(b > c){
			int tmp = b;
			b = c;
			c = tmp;
		}
		if(a > b){
			int tmp = a;
			a = b;
			b = tmp;
		}
		System.out.println(a + " " + b + " " + c);
	}
}
