import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		int N,f=0,sum=0;
		double M;
		BufferedReader br=
		new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br.readLine();
		String str2=br.readLine();
		String[] strs1=str1.split(" ",2);
		N=Integer.parseInt(strs1[0]);
		M = Integer.parseInt(strs1[1]);
		String[] strs2=str2.split(" ",N);
		int[] nums= new int[N];
		for(int i=0;i<N;i++){
			nums[i]=Integer.parseInt(strs2[i]);
			sum+=nums[i];
		}
		for(int i=0;i<N;i++){
			if(nums[i]>=(sum/(4*M))){
				f++;
			}
		}
		if(f>=M){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}