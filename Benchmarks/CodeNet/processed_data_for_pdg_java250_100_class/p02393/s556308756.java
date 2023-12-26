public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] arr = str.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int c = Integer.parseInt(arr[2]);
			int temp;
			if (a < b);
			else {
				temp = a;
				a = b;
				b = temp;
			}
			if (b < c);
			else {
				temp = b;
				b = c;
				c = temp;
			}
			if (a < b);
			else {
				temp = a;
				a = b;
				b = temp;
			}
			System.out.println(String.valueOf(a) + " " + String.valueOf(b) + " " + String.valueOf(c));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
