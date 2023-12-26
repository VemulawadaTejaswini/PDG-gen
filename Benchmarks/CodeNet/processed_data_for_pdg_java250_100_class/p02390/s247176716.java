public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int second = Integer.parseInt(br.readLine());
		int hour = second/3600;
		second = second - hour * 3600;
		int minute = second/60;
		second = second - minute*60;
		System.out.println(hour+":"+minute+":"+second);
	}
}
