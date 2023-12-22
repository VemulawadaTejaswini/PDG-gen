import java.util.ArrayList;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Pair<Integer, Integer>> townList = new ArrayList<>();
		
		int[] num = new int [N];
		double ans = 0;
				
		for(int i = 0; i < N; i++) {
			num[i] = i;
			int x = sc.nextInt();
			int y = sc.nextInt();
			Pair pair = new Pair (x,y);
			townList.add(pair);
		}
		
		ans = permutation(num, townList, ans);

		int c = 1;
		for(int i = N; i > 0; i--) {
			c *= i;
		}
		System.out.println(ans / c);
		sc.close();
	}
	
	private static class Pair<first, second> {
	    public final int first;
	    public final int second;

	    Pair (int first, int second) {
	        this.first = first;
	        this.second = second;
	    }
	}
	
    private static double permutation(int[] seed, ArrayList<Pair<Integer, Integer>> townList, double ans) {
        int[] perm = new int[seed.length];
        boolean[] used = new boolean[seed.length];
        ArrayList<Double> ansList = new ArrayList<>();
        buildPerm(seed, perm, used, 0, townList, ansList);
        for(double num :ansList) {
        	ans += num;
        }
        return ans;
    }

    private static ArrayList<Double> buildPerm(int[] seed, int[] perm, boolean[] used, int index, ArrayList<Pair<Integer, Integer>> townList, ArrayList<Double> ansList) {
    	if (index == seed.length) {
        	for(int i = 0; i < perm.length - 1; i++) {
    			Pair p1 = townList.get(perm[i]);
    			Pair p2 = townList.get(perm[i + 1]);
    			double temp = Math.pow((p2.first - p1.first), 2) + Math.pow((p2.second - p1.second), 2) ;
    			ansList.add(Math.sqrt(temp));
    		}
        	return ansList;
        }

        for (int i = 0; i < seed.length; ++i) {
            if (used[i]) continue;
            perm[index] = seed[i];
            used[i] = true;
            buildPerm(seed, perm, used, index + 1, townList, ansList);
            used[i] = false;
        }
        return ansList;
    }

}