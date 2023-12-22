import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int Y = Integer.parseInt(s[0]);
		int X = Integer.parseInt(s[1]);
		char[] value = new char[X+3];
		for(int i = 0;i<value.length;i++){
		    value[i] = '#';
		}
		String line = new String(value);
		System.out.println(line);
	    
	    for(int i = 0;i<Y;i++){
	        System.out.println("#" + br.readLine() + "#");
	    }
	    System.out.println(line);
	}
	
}