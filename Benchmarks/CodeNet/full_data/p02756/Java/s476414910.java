
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		StringBuilder sb = new StringBuilder(br.readLine());

		int q = Integer.parseInt(br.readLine());
		
		boolean reverseFlg = false;
		String line = null;
		for(int i=0;i<q;i++) {
			line = br.readLine();
			String[] arr = line.split(" ");
			if(arr[0].equals("1")) {
				reverseFlg = !reverseFlg;
			}else {
				if((arr[1].equals("1") && !reverseFlg) || (arr[1].equals("2") && reverseFlg)) {
					sb.insert(0, arr[2]);
				} 
				else {
					sb.append(arr[2]);
				}
				
			}
		}
		br.close();
		if(reverseFlg) {
			sb.reverse();
		}
		System.out.println(sb.toString());
		
	}
	
	

}
