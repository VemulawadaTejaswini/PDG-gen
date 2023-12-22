import java.io.*;
public class Main{
	public static void main(String args[])throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		if(A==B){
			System.out.println(C);
		}
		else if(A==C){
			System.out.println(B);
		}
		else{
			System.out.println(A);
		}
	}
}