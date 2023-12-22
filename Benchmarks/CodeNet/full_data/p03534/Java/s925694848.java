import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = in.readLine();
		
		int numA = 0;
		int numB = 0;
		int numC = 0;
		
		int length = s.length();
		
		for(int i = 0; i < length; i++){
			if(s.charAt(i) == 'a'){
				numA++;
			}else if(s.charAt(i) == 'b'){
				numB++;
			}
			else{
				numC++;
			}
		}
		
		//System.err.println(numA + " " + numB + " " + numC);
		
		//compare A and B
		if(Math.abs(numA - numB) > 1){
			//System.err.println("A - B");
			out.write("NO" + "\n");
		}
		else if(Math.abs(numA - numC) > 1){
			//System.err.println("A - C");
			out.write("NO" + "\n");
		}
		else if(Math.abs(numB - numC) > 1){
			//System.err.println("B - C");
			out.write("NO" + "\n");
		}
		else{
			out.write("YES" + "\n");
		}
		
		
		
		
		out.close();
		in.close();
	}
}
