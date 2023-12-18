public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		String[] size = input.split(" ");
		int leangh = Integer.parseInt(size[0]);
		int height = Integer.parseInt(size[1]);
		System.out.println(leangh*height + " " + 2*(leangh + height));
	}
}
