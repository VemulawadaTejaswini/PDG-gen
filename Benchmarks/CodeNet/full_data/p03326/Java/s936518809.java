import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Cake[] cakes = new Cake[n];
		for (int i = 0; i < n; i++) {
		    cakes[i] = new Cake(sc.nextLong(), sc.nextLong(), sc.nextLong());
		}
		long max = 0;
		for (int i = 0; i < 4; i++) {
    		Cake.type = i;
    		Arrays.sort(cakes);
    		max = Math.max(max, getMax(cakes, m, true));
    		max = Math.max(max, getMax(cakes, m, false));
		}
	    System.out.println(max);
   }
   
   static long getMax(Cake[] cakes, int size, boolean order) {
       long beauty = 0;
       long populaur = 0;
       long taste = 0;
       for (int i = 0; i < size; i++) {
           Cake c;
           if (order) {
               c = cakes[i];
           } else {
               c = cakes[cakes.length - i - 1];
           }
           beauty += c.beauty;
           populaur += c.populaur;
           taste += c.taste;
       }
       return Math.abs(beauty) + Math.abs(populaur) + Math.abs(taste);
   }
   
   static class Cake implements Comparable<Cake> {
       static int[][] types = new int[][] {{1, 1, 1}, {-1, 1, 1}, {1, -1, 1}, {1, 1, -1}};
       static int type = 0;
       
       long beauty;
       long taste;
       long populaur;
       
       public Cake(long beauty, long taste, long populaur) {
           this.beauty = beauty;
           this.taste = taste;
           this.populaur = populaur;
       }
       
       public int compareTo(Cake another) {
           long a = beauty * types[type][0] + taste * types[type][1] + populaur * types[type][2];
           long b = another.beauty * types[type][0] + another.taste * types[type][1] + another.populaur * types[type][2];
           if (a < b) {
               return -1;
           } else if (a == b) {
               return 0;
           } else {
               return 1;
           }
       }
   }
}


