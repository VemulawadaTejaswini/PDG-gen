class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = br.readLine();
			String[] splitInput = input.split(" ", 0);
			int a = Integer.parseInt(splitInput[0]);
			int b = Integer.parseInt(splitInput[1]);
			if (!(a >= 1 && b <= 100)) {
				throw new IllegalArgumentException();
			}
			System.out.println((a * b) + " " + (a * 2 + b * 2));
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
