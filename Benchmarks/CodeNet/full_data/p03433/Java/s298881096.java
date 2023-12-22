import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		String harai="",oturi="";
		 str=bfr.readLine();
		 harai=str;

		 str=bfr.readLine();
		 oturi=str;

		 int ha=Integer.parseInt(harai);
		 int ot=Integer.parseInt(oturi);

		 if(ha%500<=ot) {
			 System.out.println("Yes");
		 }
		 else {
			 System.out.println("No");
		 }
	}
}