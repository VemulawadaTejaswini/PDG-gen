public class Main {
	 public static void main(String[] args) {
		    java.util.Scanner scanner = new java.util.Scanner(System.in);
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    int c = scanner.nextInt();
		    int d = scanner.nextInt();
		    int e = scanner.nextInt();
		    int f = scanner.nextInt();
		    
		    int a1 = 1;
		    int b1 = 0;
//		    int c1 = 1; 
//		    int d1 = 0;
		    
		    double maxnoudo = 0;
		    int maxtotal = 0;
		    int maxsatou = 0;
		    int total = 0;
		    
		    while(true) {
		    	int c1 = 1;
		    	int d1 = 0;
			    int mizu = 100 * ( a * a1 + b * b1);
			    if (mizu + c > f) {
			    	break;
			    }
			    while (true) {
				    int satou = c * c1 + d * d1;
				    total = mizu + satou;
				    if (total > f) {
				    	break;
				    }
				    if ((satou * 100 / mizu) > e) {
				    	break;
				    }
				    int noudo = satou * 100 / total;
				    if (noudo > maxnoudo) {
				    	maxnoudo = noudo;
				    	maxtotal = total;
				    	maxsatou = satou;
				    }
				    if (c1 > d1) { c1--; d1++; } else { c1++; }
			    }
			    if (a1 > b1) { a1--; b1++; } else { a1++; }
	 		}
		    System.out.println(maxtotal + " " + maxsatou);
		 }
}