public class Main {
	public static void main(String[] args) throws IOException {
		String s;
		int idt;
		BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
			s = kbd.readLine();
			idt = Integer.parseInt(s);
			System.out.println(idt * idt * idt);
	}
}
