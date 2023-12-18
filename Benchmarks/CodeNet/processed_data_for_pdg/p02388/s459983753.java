public class Main{
public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
	try {
		String line = reader.readLine();
		int x = Integer.parseInt(line);
		int y;
		y=x*x*x;
		System.out.println(y);
		} catch (IOException e) { 
			System.out.println(e);
		} catch (NumberFormatException e) { 
			System.out.println("error\n");
		}
}
}
