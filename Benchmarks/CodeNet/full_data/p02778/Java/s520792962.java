import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			for(int i = 0; i < line.length(); i++){
				System.out.print("x");
			}
			System.out.println("");
		}catch(IOException e){
			System.out.println(e);
		}
	}
}