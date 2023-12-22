import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws Exception{
		// System.setIn(new FileInputStream("file"));
		try(BufferedReader  kb = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter out = new PrintWriter(System.out)){
			for(String in; (in= kb.readLine())!= null; ){
				int n = Integer.parseInt(in);
				int[] xd= new int[n];
				for (int i = 0; i < n; i++) {
					in=kb.readLine();
					xd[i] = Integer.parseInt(in.trim());
				}
				out.println(solve(xd));
			}
		}
	}

	static int solve(int[] xd) {
		for (int i = 0; i < 1000000000/2; i++) {
			for (int j = 0; j < xd.length-2; j++) {
				if(xd[j]>xd[j+2]){
					int t=xd[j];
					xd[j]=xd[j+2];
					xd[j+2]=t;
				}
			}
		}
		int cont=0;
		for (int i = 0; i < xd.length-1; i++) {
			if(xd[i]>xd[i+1]){
				int t=xd[i];
				xd[i]=xd[i+1];
				xd[i+1]=t;
				cont++;
			}
				
		}
		return cont;
	}
}
