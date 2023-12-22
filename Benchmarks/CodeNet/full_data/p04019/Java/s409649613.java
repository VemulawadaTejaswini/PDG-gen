import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		// System.setIn(new FileInputStream("file"));
		try(BufferedReader  kb = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter out = new PrintWriter(System.out)){
			for(String in; (in= kb.readLine())!= null; ){
				out.println(solve(in.trim()));
			}
		}
	}

	static String solve(String trim) {
		boolean[] xd = new boolean[4];

		for(int i= 0;i<trim.length(); i++ ){
			if(trim.charAt(i)=='N')
					xd[0]=true;
			if(trim.charAt(i)=='S')
				xd[1]=true;
			if(trim.charAt(i)=='E')
				xd[2]=true;
			if(trim.charAt(i)=='W')
				xd[3]=true;
			
			
		}

		return (xd[0]==xd[1]&&xd[2]==xd[3])?"Yes":"No";


	}

}
