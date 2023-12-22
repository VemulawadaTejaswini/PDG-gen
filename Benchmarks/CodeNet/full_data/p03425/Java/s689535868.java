import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); in.nextLine();
		int[] ary = new int[5];
		while( N-- > 0 ) {
			char c = in.nextLine().charAt(0);
			switch(c) {
				case 'M': ary[0]++; break;
				case 'A': ary[1]++; break;
				case 'R': ary[2]++; break;
				case 'C': ary[3]++; break;
				case 'H': ary[4]++; break;
				default: break;
			}
		}
		long total = 0;
		for( int i = 0; i < 5; i++ ) {
			for( int j = i+1; j < 5; j++ ) {
				for( int k = j+1 ; k < 5; k++ ) {
					total += ary[i]*ary[j]*ary[k];
				}
			}
		}
		System.out.println(total);
	}
}