public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		String str = x.readLine();
		int num = Integer.parseInt(str);
		 num = num*num*num;
		 System.out.println(num);
	}
}
