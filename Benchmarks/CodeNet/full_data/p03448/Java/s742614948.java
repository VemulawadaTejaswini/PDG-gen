import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[]arg) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		int c500=0;
		int c100=0;
		int c050=0;
		int ndn=0;
		int tori=0;
		String str="";

		str=bfr.readLine();
		c500=Integer.parseInt(str);
		str=bfr.readLine();
		c100=Integer.parseInt(str);
		str=bfr.readLine();
		c050=Integer.parseInt(str);
		str=bfr.readLine();
		ndn=Integer.parseInt(str);
		for(int i=0; i<=c500; i++) {
			for(int j=0; j<=c100; j++) {
				for(int k=0; k<=c050; k++) {
					if(ndn==i*500+j*100+k*50) {
						tori++;
					}
				}
			}
		}

		System.out.println(tori);
	}
}