import java.io.*;

class A0412
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = str.indexOf('7');
		if(num <0){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}