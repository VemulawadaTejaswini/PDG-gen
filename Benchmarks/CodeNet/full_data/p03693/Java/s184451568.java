import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";

		str=bfr.readLine();
		String[] wake=str.split(" ");
		int a=Integer.parseInt(wake[0]);
		int b=Integer.parseInt(wake[1]);
		int c=Integer.parseInt(wake[2]);

		int baisu=b*10+c;

		if(baisu%4==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}