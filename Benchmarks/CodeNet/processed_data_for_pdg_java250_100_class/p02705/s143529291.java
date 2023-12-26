public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bfr= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(bfr.readLine());
		int R = Integer.parseInt(str.nextToken());
		double answer = 2*(3.141592)*R;
		System.out.println(answer);
	}
}
