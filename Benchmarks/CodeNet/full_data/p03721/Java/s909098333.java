import java.util.Scanner;
import java.util.TreeMap;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		TreeMap<Long,Integer> g=new TreeMap<Long,Integer>();
		long[] aa=new long[100001];
		int[] bb = new int[n];
		long sum = 0;
		for(int i = 0; i < n; i++){
			long a = sc.nextLong();
			int b = sc.nextInt();
			aa[i]=a;
			bb[i]=b;
			if(!g.containsKey(aa[i])){
				g.put(aa[i],bb[i]);
			}else{
				g.put(aa[i],bb[i]+g.get(aa[i]));
			}
		}
		for(long i :g.keySet()){
			sum+=g.get(i);
			if(sum>=k){
				System.out.println(i);
				return;
			}
		}
	}
}