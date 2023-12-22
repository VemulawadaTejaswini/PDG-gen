import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
 		
		for(int i=0; i<str.length(); i++){
          	System.out.println(str.charAt(i));
			if(i%2==1)
            {
              if (str.charAt(i)=='R')
              {
                System.out.println("No");
                return;
              }
            }
          	else
            {
              if (str.charAt(i)=='L')
              {
                System.out.println("No");
                return;
              }
            }
		}
		System.out.println("Yes");
	}
}