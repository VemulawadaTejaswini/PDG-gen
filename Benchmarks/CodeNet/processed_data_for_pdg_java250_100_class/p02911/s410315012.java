	import java.util.HashMap;
public class Main {
	public Main() {
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int len, rem;
		long n, k, q,index,ai,count;
		String s,t,answer;
		Map <Long,Long> mapA= new HashMap<Long,Long>();
		n = sc.nextInt();
		k = sc.nextLong();
		q = sc.nextInt();
		LoopA: for(index=0;index<q;index++) {
			ai = sc.nextLong();
			if(mapA.containsKey(ai)) {
				count=mapA.get(ai);
				mapA.put(ai,count+1);
			}
			else{
				mapA.put(ai,1L);
			}
		}
		sc.close();
		 for(index=1;index<=n;index++) {
			if(mapA.containsKey(index)) {
				count=mapA.get(index);
			}
			else {
				count=0;
			}
			if(count+k-q>0) {
				System.out.println("Yes");
			}	
			else {
				System.out.println("No");
				}
			}
	}
}	
