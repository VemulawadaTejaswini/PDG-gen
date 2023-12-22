import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String s = br.readLine();
		int q = Integer.parseInt(br.readLine());
		
		String line = null;
		for(int n=0;n<q;n++) {
			line = br.readLine();
			String[] arr = line.split(" ");
			if(arr[0].equals("1")) {
				StringBuffer sb = new StringBuffer();
				for(int i=s.length()-1;i>=0;i--){
					sb.append(s.charAt(i));
				}
				s = sb.toString();
			}
			if(arr[0].equals("2")) {
				if(arr[1].equals("1")) {
					s = arr[2] + s;
				}
				if(arr[1].equals("2")) {
					s = s+ arr[2];
				}
			}
		
		}	
		br.close();
		
		System.out.println(s);
		
	}
	
	

}
