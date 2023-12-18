public class Main {
	public static void main(String[] args){
		int a=0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			try {
				line = reader.readLine();
			} catch (IOException e) {
				System.out.println(e);
			}
			a = Integer.parseInt(line);
			a=a*a*a;
			System.out.println(a);
    }
}
