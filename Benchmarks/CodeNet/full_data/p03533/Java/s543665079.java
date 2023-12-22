import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Akiba {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String str = in.readLine();
		int length = str.length();
		
		String s = "KIHBR";
		
		StringBuilder noA = new StringBuilder();
		for(int i = 0; i < length; i++){
			if(str.charAt(i) != 'A'){
				noA.append(str.charAt(i));
			}
		}
		
		boolean failed = false;
		
		//System.err.println(noA.toString());
		if(s.equals(noA.toString())){
			//GOOD
			//have to check #of As
			int i = 0;
			char c = str.charAt(i);
			int count  = 0;
			while(str.charAt(i) != 'K'){
				count++;
				i++;
			}
			if(count > 1){
				//System.err.println("Failed at K");
				//out.write("NO" + "\n");
				failed =true;
			}
			count = 0;
			i++;
			if(str.charAt(i) != 'I'){
				//System.err.println("Failed at I");
				//out.write("NO" + "\n");
				failed =true;
			}
			i++;
			if(str.charAt(i) != 'H'){
				//System.err.println("Failed at H");
				//out.write("NO" + "\n");
				failed =true;
			}
			i++;
			while(str.charAt(i) != 'B'){
				count++;
				i++;
			}
			if(count > 1){
				//System.err.println("Failed at B");
				//out.write("NO" + "\n");
				failed =true;
			}
			count = 0;
			i++;
			while(str.charAt(i) != 'R'){
				count++;
				i++;
			}
			if(count > 1){
				//System.err.println("Failed at R");
				//out.write("NO" + "\n");
				failed =true;
			}
			count = 0;
			i++;
			while(i < str.length()){
				count++;
				i++;
			}
			if(count > 1){
				//System.err.println("Failed at LAST As");
				//out.write("NO" + "\n");
				failed =true;
			}
			if(!failed){
				out.write("YES" + "\n");
			}
			else{
				out.write("NO" + "\n");
			}
			
		}
		else{
			//System.err.println("Failed at BASE");
			out.write("NO" + "\n");
		}
		
		
		out.close();
		in.close();
	}
}
