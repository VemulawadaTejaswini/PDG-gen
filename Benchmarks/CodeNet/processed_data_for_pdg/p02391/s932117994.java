public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(
				new InputStreamReader (System.in));
		String line=br.readLine();
		String[] str = line.split(" ");
		int a=Integer.parseInt(str[0]);
		int b=Integer.parseInt(str[1]);
		if(a<b) System.out.println("a < b");
		else if(a>b) System.out.println("a > b");
		else System.out.println("a == b");
	}
}
