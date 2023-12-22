import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int m=sc.nextInt();
		int p[]= new int[m];
		long y[]=new long[m];
		Map<Long,Long> map= new HashMap<Long,Long>();
;		long num[]=new long[m];

		for(int i=0;i<m;++i){
			p[i]=sc.nextInt();
			y[i]=sc.nextLong();
			num[i]=1000000*p[i]+y[i];
		}
		Arrays.sort(num);

		long div=1;
		long counter=1;
		for(int i=0;i<m;++i){
			if(num[i]/1000000==div);
			else{
				div=num[i]/1000000;
				counter=1;
			}
			map.put(num[i]-div*1000000,counter);
			++counter;
		}

		for( int i=0;i<m;++i){
			String s=String.valueOf((long)1000000+p[i]);
			String s2=String.valueOf(1000000+map.get(y[i]));
			System.out.println(s.substring(1)+s2.substring(1));
		}
	}
}