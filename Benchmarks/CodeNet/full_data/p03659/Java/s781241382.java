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
		int max = 0;
		int harf = 0;
		for(int i=0;i<n;i++){
			numnum[i] = Integer.parseInt(nagasa[i]);
		}
		int akun = 0;
		int bkun = 0;
		int maxlong=9999999;
		for(int i=1;i<n;i++){
			for(int j=1;j<i+1;j++){
				akun += numnum[j-1];
			}
			for(int j=i+1;j<n;j++){
				bkun += numnum[j-1];
			}
			if(maxlong>Math.abs(akun - (bkun))){
				maxlong = Math.abs(akun - (bkun));
			}
			akun = 0;
			bkun = 0;
		}
		System.out.println(""+akun+""+bkun);
		System.out.println(""+maxlong);

		
	}
}


