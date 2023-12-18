public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strAry = str.split(" ");
		int[] intAry = new int[3];
		for(int i = 0; i < strAry.length; i++ ) {
			intAry[i] = Integer.parseInt(strAry[i]);
		}
		Arrays.sort(intAry);;
		System.out.println(intAry[0] + " " + intAry[1] + " " + intAry[2]);
	}
}
