import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		int pronum = scan.nextInt();
		int ninki = scan.nextInt();
		int hyou[] = new int[pronum];
		int rank[] = new int[pronum];
		int sn = 0;
		
		for(int i = 0; i < pronum; i++) {
			hyou[i] = scan.nextInt();
			sn += hyou[i];
		}
		
		int howmany = 0;
		String yes = "yes";
		int where = 0;
		
		do {
			int big = 0;
			for(int jk = 0;jk < pronum;jk++) {
				if(big < hyou[jk] ){
					big = hyou[jk];
					where = jk;
				}
			}
			
			hyou[where] = 0;
			
			if(big >= (sn / (4 * ninki))){
				yes = "yes";
				
			}else {
				yes = "no";
				break;
			}
			
			howmany++;
			
		}while(howmany < ninki);
		
		System.out.println(yes);
		
	}
}
