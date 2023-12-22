
import java.util.*;

public class Main{
	public static void main(String[] args){
		
		//long startTime = System.currentTimeMillis();
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] count0=new int[60];
		int[] count1=new int[60];
		
		
		for(int i=0;i<n;i++){
			long l=sc.nextLong();

			for(double j=59;j>=0;j--){
				if(l/(long)(Math.pow(2,j))==1)count1[(int)j]++;
				else count0[(int)j]++;
				//System.out.println("j:"+j+" l:"+l+" res: "+l/(long)(Math.pow(2,j)));
				l=l%(long)Math.pow(2,j);
			}
		}
		
		long ans=0;
		long div=(long)Math.pow(10, 9)+7;
		
		for(int i=0;i<60;i++){
			//System.out.println("i:"+i+" 0:"+count0[i]+" 1: "+count1[i]);
			//System.out.println(1);
			ans=(ans+(long) ((count0[i]*count1[i]))*(long)Math.pow(2, i))%div;
		}
		
		
		
		System.out.println(ans);
	}
}
