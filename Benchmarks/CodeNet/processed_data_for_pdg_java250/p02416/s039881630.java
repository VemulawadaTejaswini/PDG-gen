public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			char[] firstInput = br.readLine().toCharArray(); 
			int[] num = new int[firstInput.length];
			char seconInput = 0;
			for (int i = 0; i < firstInput.length; i++) {
				seconInput = firstInput[i];
				num[i] = Character.getNumericValue(seconInput);
			}
			if (num[0] == 0 && seconInput == '0' )break;
			int sum = 0;
			for (int i = 0; i < num.length; i++) {
				sum += num[i];
			}
			System.out.println(sum);
		} while (true);
	}
}
