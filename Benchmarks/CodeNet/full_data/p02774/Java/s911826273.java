import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			long k = sc.nextLong();
				
			int negCount = 0;
			int zeroCount = 0;
			int posCount = 0;
			List<Long> negValues = new ArrayList<>();
			List<Long> posValues = new ArrayList<>();
			for(int i = 0 ; i < n ; i++ ) {
				long v = sc.nextLong();
				
				negCount += (v < 0 ? 1 : 0);
				zeroCount += (v == 0 ? 1 : 0);
				posCount += (v > 0 ? 1 : 0);
				
				if ( v < 0) {
					negValues.add(v);
				}
				if ( v > 0 ) {
					posValues.add(v);
				}
			}
			
			Collections.sort(negValues);
			Collections.sort(posValues);
		
			//find k range
			long negRange = negCount * posCount;
			if ( k <= negRange) {
				//calc negRange
				
				PriorityQueue<Long> pq = new PriorityQueue<>(new Comparator<Long>() {

					@Override
					public int compare(Long o1, Long o2) {
						return Long.compare(o1, o2);
					}
					
				});
				
				for(Long nv : negValues) {
					for(Long pv : posValues) {
						pq.add(nv * pv);
					}
				}
				
				long v = 0;
				for(int i = 0 ; i < k ; i++) {
					v = pq.poll();
				}
				
				System.out.println(v);
				
				return;
			}
			long zeroRange = comb(zeroCount) + zeroCount * (negCount + posCount);
			
			if ( k <= negRange + zeroRange) {
				System.out.println(0);
				return;
			}
			
			//ok it is now positive zone
			long kDiff = k - (negRange + zeroRange);
			
			PriorityQueue<Long> pq = new PriorityQueue<>(new Comparator<Long>() {

				@Override
				public int compare(Long o1, Long o2) {
					return Long.compare(o1, o2);
				}
				
			});
			
			for(int i = 0 ; i < negValues.size() -1 ; i++ ) {
				for(int j = i+1 ; j < negValues.size() ; j++ ) {
					pq.add(negValues.get(i) * negValues.get(j));
				}
			}
			
			for(int i = 0 ; i < posValues.size() -1 ; i++ ) {
				for(int j = i+1 ; j < posValues.size() ; j++ ) {
					pq.add(posValues.get(i) * posValues.get(j));
				}
			}
			
			long v = 0;
			for(int i = 0 ; i < kDiff ; i++) {
				v = pq.poll();
			}
			System.out.println(v);
		}
	}
	
	public static long comb(long n) {
		if ( n == 0) return 0;
		if ( n == 1) return 1;
		return n * (n-1) / 2;
	}
}