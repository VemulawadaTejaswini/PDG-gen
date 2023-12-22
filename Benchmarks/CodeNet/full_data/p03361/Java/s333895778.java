import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		String str=  br.readLine();
		int a = Integer.valueOf(str.split(" ")[0]);
		int b = Integer.valueOf(str.split(" ")[1]);
		char arr[][] = new char[a+5][b+5];
		for(int i=1;i<=a;i++){
			str = br.readLine();
			for(int ii=1;ii<=b;ii++){
				arr[i][ii] = str.charAt(ii-1);
			}
		}
		String ans = "Yes";
		big:
		for(int i=1;i<=a;i++){
			for(int ii=1;ii<=b;ii++){
				if(arr[i][ii] == '#'){
					if(arr[i][ii-1] == '#' || arr[i][ii+1] == '#' || arr[i-1][ii] == '#' || arr[i+1][ii] == '#'){
						ans = "Yes";
					} else {
						ans = "No";
						break big;
					}
				}
			}
		}
	
		System.out.println(ans);
	}
}
