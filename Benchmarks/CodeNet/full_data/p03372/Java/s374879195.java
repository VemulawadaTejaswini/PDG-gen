import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int N = sc.nextInt();
	      long C = sc.nextLong();
	      long [] x = new long[N + 2];
	      long [] v = new long[N + 2];
	      for(int i = 1; i <= N; i++) {
	    	    x[i] = sc.nextLong();
	    	    v[i] = sc.nextLong();
		  }
	      sc.close();
	      
	      x[0] = 0;
	      v[0] = 0;
	      x[N + 1] = C;
	      v[N + 1] = 0;
	      long energy = 0;
	      long totalEnergyA[] = new long[N + 2];
	      long totalEnergyB[] = new long[N + 2];
	      totalEnergyA[0] = 0;
	      
	      for(int i = 0; i <= N; i++) {
	    	    if(i == 0) {
	    	    	  totalEnergyA[i] = 0;
	    	    }else {
	    	      totalEnergyA[i] = totalEnergyA[i - 1] + v[i];
	    	    }
    		  }
	      for(int i = N + 1; i >= 1; i--) {
	    	    if(i == N + 1) {
	    	    	  totalEnergyB[i] = 0;
	    	    }else {
	    	      totalEnergyB[i] = totalEnergyB[i + 1] + v[i];
	    	    }
  		  }
	      
	      for(int a = 0; a <= N; a++) {
	    	    for(int b = a + 1; b <= N + 1; b++) {
	    	    	  long tmpEnergy = 0;
	    	    	  tmpEnergy = tmpEnergy + totalEnergyA[a] + totalEnergyB[b] - (2 * Math.min(x[a], C - x[b]) + Math.max(x[a], C - x[b]));
	    	    	  if(tmpEnergy > energy) {
	    	    		  energy = tmpEnergy;
	    	    	  }
			}	
		  }
	      
	      System.out.println(energy);
	      System.exit(0);
	    }
}