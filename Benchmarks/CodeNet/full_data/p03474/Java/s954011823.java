import java.io.*;

public class Main{
	public static void main(String[] args){
		
		try(
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		){
			String[] str = br.readLine().split(" ");
			int A = Integer.parseInt(str[0]);
			int B = Integer.parseInt(str[1]);
			
			String postalCode = br.readLine();
			
			String reg = "\\d{" + A + "}-\\d{" + B + "}";
			if(postalCode.matches(reg)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
