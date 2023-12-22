import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int N = sc.nextInt();
	      int C = sc.nextInt();
	      int [] x = new int[N];
	      int [] v = new int[N];
	      for(int i = 0; i < N; i++) {
	    	    x[i] = sc.nextInt();
	    	    v[i] = sc.nextInt();
		  }
	      sc.close();
	      
	      int energy = 0;
	      int myPlace = 0;
	      int maxEnergy = 0;
	      
	      do {
	      int [] distance = new int[N];
	      int minIndex = 0;
	      maxEnergy = 0;
	      for(int i = 0; i < N; i++) {
	    	  	int minDistance = C;
	    	  	distance[i] = Math.min(x[i] - myPlace, C - (x[i] - myPlace));
	    	  	if(v[i] - distance[i] > maxEnergy) {
	    	  		maxEnergy = v[i] - distance[i];
	    	  		minIndex = i;
	    	  	}
		  }
	      energy += maxEnergy;
	      v[minIndex] = 0;
	      }while(maxEnergy < 0);
	      
	      System.out.println(energy);
	      System.exit(0);
	    }
}