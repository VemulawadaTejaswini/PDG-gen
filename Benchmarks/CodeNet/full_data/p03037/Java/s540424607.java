

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    
	    int Lmax=0;
	    int Rmin=1000000;
	    for(int i = 0; i < M; i++) {
	    	int Li = sc.nextInt();
	    	int Ri = sc.nextInt();
	    	
	    	if (Li>Lmax)
	    		Lmax=Li;
	    	if (Ri<Rmin)
	    		Rmin=Ri;
	    	
	    }
	    sc.close();
	    System.out.println(Rmin-Lmax+1);

	}

}
