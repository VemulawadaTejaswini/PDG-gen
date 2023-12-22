import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long w = sc.nextLong();
		int n = sc.nextInt();
		HashMap<Long,Integer> map = new HashMap<>();
		long[] count = new long[10];
		int sum=0;
		for(int k = 0; k<n; k++){
			long a = sc.nextLong();
			long b = sc.nextLong();
			long l = a*w+b;
			for(long i = 0; i<3; i++){
				for(long j = 0; j<3; j++){
					if(a-i>0 && a-i+2<=h && b-j>0 && b-j+2<=w){
						long p = l - i * w - j;
						if(map.containsKey(p)){
							map.put(p,map.get(p)+1);
						}else{
							map.put(p,1);
						}
					}
				}
			}
		}
		for(long p: map.keySet()){
			count[map.get(p)]++;
			sum++;
		}
		count[0]=(h-2)*(w-2)-sum;
		for(int i = 0; i<10; i++){
			System.out.println(count[i]);
		}
	}
}