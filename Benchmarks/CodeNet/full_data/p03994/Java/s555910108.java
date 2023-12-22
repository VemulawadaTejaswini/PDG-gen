import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder temp = new StringBuilder("");
		int n = Integer.parseInt(br.readLine());
		for(int i =0;i<input.length();i++){
			if(i==input.length()-1){
				char tempe = (char) ((int)input.charAt(i)+n);
				while(tempe>122)
					tempe-=26;
				temp.append(tempe);
				continue;
			}
			if((int)'{'-  (int )input.charAt(i)<=n ){
				//System.out.println(input.charAt(i)+" knapa");
				temp.append('a');
				n -= ((int)'{'-  (int )input.charAt(i));
			}else{
				temp.append(input.charAt(i));
			}
		}
		System.out.println(temp.toString());	
	}
}