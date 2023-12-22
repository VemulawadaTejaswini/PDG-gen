import java.util.*;
public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		long[] Ai = new long[length];
		long[] Bi = new long[length];
		for(int counter = 0; counter < length; counter++) {
			Ai[counter] = sc.nextLong();
		}
		for(int counter = 0; counter < length; counter++) {
			Bi[counter] = sc.nextLong();
		}
		
		long aSum = 0;
		long bSum = 0;
		long indices = 0;
		long difference = 0;
		
		for(int counter = 0; counter < length; counter++) {
			aSum += Ai[counter];
			bSum += Bi[counter];
			if(Bi[counter] > Ai[counter]) {
				indices++;
				difference += Bi[counter] - Ai[counter];
			}
		}
		
		if(aSum >= bSum) {
			for(int counter = 0; counter < length && difference > 0; counter++) {
				if(Ai[counter] > Bi[counter]) {
					difference -= Ai[counter] - Bi[counter];
					indices++;
				}
			}
			System.out.println(indices);
		} else {
			System.out.println(-1);
		}
	}
}