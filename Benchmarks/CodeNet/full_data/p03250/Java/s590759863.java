import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[3];
		int count = 0;
		while (sc.hasNext()) {
			array[count] = sc.nextInt();
			count++;
		}
		
		int max = 0;
		for (int i=0; i < array.length; i++ ) {
			int tmpMax = array[i]*10;
			boolean findSecond = false;
			for (int j=0; j < array.length; j++ ) {
				if (i==j) {
					continue;
				}
				tmpMax+=array[j];
			}
			
			if(max < tmpMax){
				max = tmpMax;
			}
		}
		
		System.out.println(max);
	}
}