import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
 
class Main {
	public static void main(String[] args) {
 
	    Scanner sc = new Scanner(System.in);
	    double N = sc.nextDouble();
	    double M = sc.nextDouble();
	    ArrayList<Double> A = new ArrayList<>();
	    double total = 0;
	    double vote = 0;
	    
	    for (int i = 0; i < N; i++) {
	      vote = sc.nextDouble();
	      total += vote;
	      A.add(vote);
	    }
	    
	    Collections.sort(A, Comparator.reverseOrder());
	    
	    for (int j = 0; j < M; j++) {
	      if (!(A.get(j)/total >= 1/(4*M))) {
	        System.out.println("No");
	        return;
	      }
	    }
	    System.out.println("Yes");
 
	  }
}