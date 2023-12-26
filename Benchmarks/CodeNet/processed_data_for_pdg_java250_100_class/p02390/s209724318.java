public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long hour,min,sec;
		sec = Long.parseLong(br.readLine());
		sec -= (hour = sec / 60 /60) * 60 * 60;
		sec -= (min = sec / 60) * 60;
		System.out.printf("%d:%d:%d%n", hour, min, sec);
	}
}
