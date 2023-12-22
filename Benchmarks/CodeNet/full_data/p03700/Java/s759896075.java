import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A = sc.nextLong();
		long B = sc.nextLong();
		List<Long> hpList = new ArrayList<>();
		for(int i=0; i<N; i++){
			hpList.add(sc.nextLong());
		}
		sc.close();

		Collections.sort(hpList);

		long maxCount = hpList.get(hpList.size()-1)/B + 2;
		long minCount = 0;
		long count = 0;
		Long[] tmpHps = (Long[])hpList.toArray(new Long[hpList.size()]);
		while(true){
			
			if(maxCount <= minCount){
				break;
			}

			count = (maxCount + minCount)/2;

			
			int addCount = 0;
			for(int i=0; i<N; i++){
				addCount += Math.ceil(Math.max(0,(double)(tmpHps[i]-B*count)/(double)(A-B)));
			}
			if(addCount<=count){
				maxCount = count;
			}else{
				minCount = count + 1;
			}
			
		}

		System.out.println(count);		

	}


}