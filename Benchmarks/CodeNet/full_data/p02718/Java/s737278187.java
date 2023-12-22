import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		int pronum = scan.nextInt();
		int ninki = scan.nextInt();
		int hyou[] = new int[pronum];
		int sn = 0;
		
		
		
		for(int i = 0; i < pronum; i++) {
			hyou[i] = scan.nextInt();
			
		}
		
		for(int im = 0; im < pronum; im++) {
			sn += hyou[im];
			
		}
		for(int j = 0; j < pronum ; j++) {
			int jhyou = hyou[j];
			for(int k = j; k < pronum; k++) {
				if(hyou[k] > hyou[j]) {
					hyou[j] = hyou[k];
					hyou[k] = jhyou;
					
				}
				
			}
			
		}
		
		int howmany = 0;
		String yes = "yes";
		
		do {
			if(hyou[howmany] >= (sn / (4 * ninki))){
				yes = "yes";
				
			}else {
				yes = "no";
				break;
			}
			
			howmany++;
			
		}while(howmany < ninki);
		
		System.out.println(yes);
		for(int ik = 0; ik < pronum;ik++) {
			System.out.println(hyou[ik]);
			
		}
		
		System.out.println(sn);
		
		
		
	}
}
