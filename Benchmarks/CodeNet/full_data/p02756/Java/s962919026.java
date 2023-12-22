import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		StringBuilder sb = new StringBuilder(br.readLine());
//		sb.append(br.readLine());
		int q = Integer.parseInt(br.readLine());
		
		String line = null;
		for(int i=0;i<q;i++) {
			line = br.readLine();
			String[] arr = line.split(" ");
			if(arr[0].equals("1")) {
				sb.reverse();
			}else {
				if(arr[1].equals("1")) {
					sb.insert(0, arr[2]);
				} else {
					sb.append(arr[2]);
				}
			}
		}
		br.close();
		
		System.out.println(sb.toString());
		
	}
	
	

}
