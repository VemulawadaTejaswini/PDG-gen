import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int d = Integer.parseInt(str[3]);
		if(Math.abs(a-c)<=d){
			System.out.println("Yes");
		}else if(Math.abs(a-b)<=d && Math.abs(b-c)<=d){
			System.out.println("Yes");

		}else{
			System.out.println("No");
		}

	}
}