public class Main {
	public static void main(String[] arges) {
		List<String> klist = new ArrayList<String>();
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while (i < 1) {
			String line = sc.nextLine();
			klist.add(line);
			if (line.equals("0 0")) {
				break;
			}
		}
		for (String string : klist) {
			if (string.equals("0 0")) {
				break;
			}
			String[] k = string.split(" ");
			int v = Integer.parseInt(k[0]);
			int v2 = Integer.parseInt(k[1]);
			for (int j = 0; j < v; j++) {
				int count = 0;
				if ((j + 1 )% 2 == 1) {
					while (count < v2) {
						if ((count + 1) % 2 == 1) {
							System.out.print("#");
							count++;
						} else {
							System.out.print(".");
							count++;
						}
					}
				} else {
					while (count < v2) {
						if ((count + 1) % 2 == 1) {
							System.out.print(".");
							count++;
						} else {
							System.out.print("#");
							count++;
						}
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}
