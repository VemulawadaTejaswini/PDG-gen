import java.io.*;

class Main{

	public static void main(String arg[]) throws IOException{
		String message;
		int n=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		message = br.readLine();
		String num[] = message.split(" ");
		message = br.readLine();
		String nagasa[] = message.split(" ");
		n = Integer.parseInt(num[0]);
		int numnum[] = new int[n];
		long all = 0;
		int harf = 0;
		for(int i=0;i<n;i++){
			numnum[i] = Integer.parseInt(nagasa[i]);
			all += numnum[i];
		}
		long akun = 0;
		long maxlong=99999999999999L;
		for(int i=0;i<n-1;i++){
			akun += numnum[i];
			if(maxlong>Math.abs(all- 2*akun)){
				maxlong = Math.abs(all - 2*(akun));
			}
		}
		System.out.println(""+maxlong);

		
	}
}
