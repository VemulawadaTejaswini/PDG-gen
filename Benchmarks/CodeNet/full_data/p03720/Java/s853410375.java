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
		int n3=0;
		int n4=0;
		int ans[]=new int[50];

		for(int i=0;i<n2;i++){
			String str2=br.readLine();
			String[] str3=str2.split(" ",0);
			n3=Integer.parseInt(str3[0]);
			n4=Integer.parseInt(str3[1]);
		ans[n3]++;
		ans[n4]++;
		}
	 for(int i=1;i<=n1;i++){
	System.out.println(ans[i]);
	 }
	}
}
		

