import java.io.*;

class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String bc[] = br.readLine().split(" ",0);
		int a = Integer.parseInt(bc[0]);
		int b = Integer.parseInt(bc[1]);
		int c = Integer.parseInt(bc[2]);
		
		if (a <= c && c <= b) {
			System.out.println("Yes");	
		}else{
			System.out.println("No");
		}
		
	}
}