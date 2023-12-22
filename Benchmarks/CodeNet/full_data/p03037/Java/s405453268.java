 

import java.util.Scanner; 
class Main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in) ;
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = 1 ;
		int L[] = new int[m];
		int R[] = new int[m];
		
		for(int i = 0 ; i<m ; i++) {
			L[i] = scan.nextInt();
			R[i] = scan.nextInt();
		}
		int count = 0 ;int total = 0 ;
		for(int i = 1 ; i<=n ;i++ ) {
			count = 0 ;
			for(int j = 0 ; j < m ; j++) {
				if(i>=L[j] && i<=R[j]) {
					count++;
				}else{
                  break;
                }
			}
			//System.out.println(count);
			if(count == m) {
				total++;
			}
			
		}
		System.out.println(total);
	  
	}
}
