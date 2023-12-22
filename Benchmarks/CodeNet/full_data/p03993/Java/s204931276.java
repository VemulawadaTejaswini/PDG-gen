import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str;
		str = br.readLine();
		String[] str1 = (br.readLine()).split(" ");
		int n = Integer.parseInt(str);
		int[] arr = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++){
			arr[i] = Integer.parseInt(str1[i]);
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]==(j+1) && arr[j]==(i+1)){
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}