public class Main {
	public static void main(String[] args) {
		String line = null;
		try (Scanner sc = new Scanner(System.in)) {
			line = sc.nextLine();
			int inputNUm = Integer.parseInt(line);
			System.out.println(inputNUm * inputNUm * inputNUm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
