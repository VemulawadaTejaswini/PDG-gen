import java.io.*;

class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			int A = Integer.parseInt(line);
			line = reader.readLine();
			int B = Integer.parseInt(line);
			int result = 6 - (A + B);
			System.out.println(result);
		}catch(NumberFormatException e){
			e.printStackTrace();
			System.exit(0);
		}catch(IOException e){
			e.printStackTrace();
			System.exit(0);
		}
	}
}