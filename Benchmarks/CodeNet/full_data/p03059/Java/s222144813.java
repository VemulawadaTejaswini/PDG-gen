import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String inputN = scanner.nextLine();
		String inputA = scanner.nextLine();

		scanner.close();
		
		Integer inN = Integer.parseInt(inputN);
		List<Integer> inA = Arrays.asList( inputA.split(" ") ).stream().map(x -> Integer.parseInt(x) ).collect(Collectors.toList());
		
		Integer[] acms = new Integer[inA.size()];
		Integer[] acmsd = new Integer[inA.size()];
		
		int acm = inA.get(0);
		acms[0] = acm;
		
		// create accumulation list
		for(int i = 1; i < inN; i++) {
			acm = calc(acm, inA.get(i));
			acms[i] = acm;
		}

		acm = inA.get(inN - 1);
		acmsd[0] = acm;
		int j = 0;
		for(int i = inN - 1; i >= 0; i--) {
			acm = calc(acm, inA.get(i));
			acmsd[j] = acm;
			j++;
		}

		
		int max = 0;
		
		for(int i = 0; i< inN - 1; i++) {
			
			if(i > inN - 1) {
				int val = acms[inN - 2] ;
				if(val > max) {
					max = val;
				}
			}
			else if(i <= 0) {
				int val = 	acmsd[inN - 2];
				
				if(val > max) {
					max = val;
				}
			} else {
				int x,y;
				if(acms[i - 1] >  acmsd[(inN - 1) - i - 1]) {
					x = acms[i - 1];
					y = acmsd[(inN - 1) - i - 1];
				} else {
					y = acms[i - 1];
					x = acmsd[(inN - 1) - i - 1];
				}
				int val = 	calc( x, y ) ;
				if(val > max) {
					max = val;
				}
			}
		}
		
		System.out.println(max);
	}
	
	
	
	private static int calc(int x, int y) {
        int tmp;
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }
        
        return y;
	}
}