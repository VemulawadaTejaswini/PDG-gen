import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){

	Scanner stdIn = new Scanner(System.in);
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	try{
	String strS = input.readLine();
	String strT = input.readLine();

	char[] charArray = strS.toCharArray();
	String ans = "No";

	for(int i = 0;i < charArray.length;i++){
		char c = charArray[charArray.length - 1];

		for(int j = charArray.length - 1;j > 0;j--){
			charArray[j] = charArray[j - 1];
		}
		charArray[0] = c;
		String str = String.valueOf(charArray);

		if(str.equals(strT)){
			ans = "Yes";
			break;
		}
	}
	System.out.println(ans);
	}
	catch(IOException e){
	
	}
		



	}
}
