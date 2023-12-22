import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[]args)throws IOException{
	
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String[] str2 = str1.split(" ");
		int time=Integer.parseInt(str2[0])+Integer.parseInt(str2[1]);
		if(time>=24){
		  time=time-24;
		}
		System.out.println(time);
	}
}	

