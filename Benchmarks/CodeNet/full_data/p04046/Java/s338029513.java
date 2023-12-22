import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		int dRow = sc.nextInt();
		int dColumn = sc.nextInt();

		if(row==dRow || column==dColumn) {
			System.out.println(0);
			return;
		}
		
		Map<Long, Long> map = new HashMap<Long, Long>();
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				if(i>=row-dRow && j<dColumn) continue;
				else if(i==0 && j==0) map.put((long)0, (long)1);
				else if(i==0) map.put((long)j, map.get((long)j-1));
				else if(j==0) map.put((long)column*i, map.get((long)column*(i-1)));
				else {
					long left = map.containsKey((long)column*i+j-1) ? map.get((long)column*i+j-1) : 0;
					long up = map.containsKey((long)column*(i-1)+j) ? map.get((long)column*(i-1)+j) : 0;
					map.put((long)column*i+j, (long)left + up);
				}
			}
		}
		System.out.println(map.get((long)(row-1)*column + column-1));
	}
}