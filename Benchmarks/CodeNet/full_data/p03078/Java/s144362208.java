import java.util.*;

public class Main {
	
	private void findCombinations(long[] xArr, long[] yArr, long[] zArr, int k) {
		List<Long> ans = new ArrayList<>();
		
		for(int a = 0; a < xArr.length; a++){
			for(int b = 0; b < yArr.length; b++){
				for(int c = 0; c < zArr.length; c++){
					if((a + 1) * (b + 1) * (c + 1) <= k) ans.add(xArr[a] + yArr[b] + zArr[c]);
				}
			}
		}
		
		Collections.sort(ans, new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				return (int) (o2 - o1);
			}
		});
		
		for(long tmp : ans){
			System.out.println(tmp);
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k = sc.nextInt();
		
		long[] xArr = new long[x];
		long[] yArr = new long[y];
		long[] zArr = new long[z];
		
		for(int i = 0; i < x; i++) xArr[i] = sc.nextLong();
		for(int i = 0; i < y; i++) yArr[i] = sc.nextLong();
		for(int i = 0; i < z; i++) zArr[i] = sc.nextLong();
		
		Main dCake123 = new DCake123();
		dCake123.findCombinations(xArr, yArr, zArr, k);
	}
}