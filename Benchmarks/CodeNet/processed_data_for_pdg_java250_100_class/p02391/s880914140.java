public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] arr = str.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			if (a < b) System.out.println("a < b");
			else if(a > b) System.out.println("a > b");
			else System.out.println("a == b");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
