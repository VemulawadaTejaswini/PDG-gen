import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[]args)throws IOException{
	
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] str1=str.split(" ",0);
		int n1=Integer.parseInt(str1[0]);
		int n2=Integer.parseInt(str1[1]);
		int ans=-1;
		for(int i=0;i<n1;i++){
			String str2=br.readLine();
			String[] str3=str2.split(" ",0);
			int n3=Integer.parseInt(str3[1]);
			n2=n2-n3;
			if(n2<=0){
				 ans=Integer.parseInt(str3[0]);
						break;
			}
		}
	 
	System.out.println(ans);
		
	}
}
		
