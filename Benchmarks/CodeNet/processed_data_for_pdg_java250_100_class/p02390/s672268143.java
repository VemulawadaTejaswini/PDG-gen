public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int h = num / 3600;
		num = num - h * 3600; 
		int m = num / 60;
		int s = num - m * 60; 
		System.out.println(h + ":" + m + ":" + s);
	}
}
