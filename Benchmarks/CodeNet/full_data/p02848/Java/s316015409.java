import java.io.*;

class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			String s = reader.readLine();
			char[] c = s.toCharArray();

			for(int i = 0; i < c.length; i++){
				c[i] = (char)('A' + (c[i] - 'A' + n) % 26);
				System.out.print(c[i]);
			}
			System.out.println("");
		} catch(IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e){
			System.out.println(e);
		}
	}
}