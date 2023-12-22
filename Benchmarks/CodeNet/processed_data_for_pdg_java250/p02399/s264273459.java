public class Main {
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] str = br.readLine().split(" ");
			int a= Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int div = a / b;
			int amari = a % b;
			double syosu = (double)a/(double)b;
			System.out.printf("%d %d %5f", div, amari, syosu);
		}
}
