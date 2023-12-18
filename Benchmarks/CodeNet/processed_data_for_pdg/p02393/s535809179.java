public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		str = str.trim();
		String[] rio = str.split(" ");
		int[] threeNum = new int[3];
		threeNum[0] = Integer.parseInt(rio[0]);
		threeNum[1] = Integer.parseInt(rio[1]);
		threeNum[2] = Integer.parseInt(rio[2]);
		Arrays.sort(threeNum);
		System.out.println(threeNum[0] + " " + threeNum[1] + " " + threeNum[2]);
	}
}
