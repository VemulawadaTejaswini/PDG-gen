import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong(),k=sc.nextLong();
		HashMap<Long,Long> hm=new HashMap<Long,Long>();
		long[] h=new long[(int)n];
		long ite=0;
		for(int i=0;i<n;i++){
			long a=sc.nextLong();
			long buf=sc.nextLong();
			if(hm.containsKey(a)){
				hm.put(a, hm.get(a)+buf);
			//	System.out.println(a+" "+hm.get(a));
			}else{
				h[(int)ite]=a;
			//	System.out.println("h["+ite+"]="+h[ite]);
				ite++;
				hm.put(a, buf);
			//	System.out.println(a+" "+hm.get(a));
			}
		}
		for(int z=0;z<n;z++){
		//	System.out.print(h[z]+" ");
		}
		Arrays.sort(h);
		for(int z=0;z<n;z++){
		//	System.out.print(h[z]+" ");
		}
		int i=0;
		while(h[i]==0){
		//	System.out.println("h["+i+"]="+h[i]);
			i++;
		}
		while(k>0&&i<n){
		//	System.out.println(i);
			k-=hm.get(h[i]);
			i++;
		//	System.out.println(k);
		}
		System.out.println(h[--i]);
	}
}
