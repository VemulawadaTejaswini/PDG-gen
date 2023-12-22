import java.io.*;
import java.util.*;

public class Libra {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader in = new BufferedReader(new FileReader("prob.in"));
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("prob.out")));
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int e = a + b;
		int f = c + d;
		
		if(e == f){
			out.println("Balanced");
		}
		else if(e < f){
			out.println("Right");
		}
		else{
			out.println("Left");
		}
		
		
		
		in.close();
		out.close();
		
	}
}
