public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			while ((str = in.readLine()) != null) {
				String[] p = str.split(" ");
				int a = Integer.parseInt(p[0]);
				int b = Integer.parseInt(p[2]);
				if (p[1].equals("+")) System.out.println(a + b);
				if (p[1].equals("-")) System.out.println(a - b);
				if (p[1].equals("*")) System.out.println(a * b);
				if (p[1].equals("/")) System.out.println(a / b);
				if (p[1].equals("?")) break;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
