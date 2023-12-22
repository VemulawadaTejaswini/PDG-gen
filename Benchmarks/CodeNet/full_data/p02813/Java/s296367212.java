import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		List<List<Integer>> permutation = new ArrayList<>();
        List<Integer> candidate = new ArrayList<>(n);
		StringBuffer P = new StringBuffer();
		StringBuffer Q = new StringBuffer();
		
		for(int i = 1; i <= n; i++) {
			candidate.add(i);
		}
		for(int i = 1; i <= n; i++) {
			P.append(sc.nextInt());
		}
		for(int i = 1; i <= n; i++) {
			Q.append(sc.nextInt());
		}
		
		List<List<Integer>> result = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        permutation = buildPerm(result, candidate, perm);
        int pNum = 0;
        int qNum = 0;
        
        for(int i = 0; i < permutation.size(); i++) {
        	StringBuffer num = new StringBuffer();
        	for(int temp : permutation.get(i)) {
        		num.append(temp);
        	}
        	if(num.toString().equals(P.toString())) {
        		pNum = i + 1;
        	}
        	if(num.toString().equals(Q.toString())) {
        		qNum = i + 1;
        	}
        }
        
		System.out.println(Math.abs(pNum - qNum));
		sc.close();
	}
	
    private static List<List<Integer>> buildPerm(List<List<Integer>> result, List<Integer> candidate, List<Integer> perm) {
        if (candidate.size() == 0) {
            result.add(perm);
        }
        else {
            for (int i = 0; i < candidate.size(); i++) {
                List<Integer> p = new ArrayList<>(perm);
                List<Integer> c = new ArrayList<>(candidate);
                p.add(c.get(i));
                c.remove(i);
                buildPerm(result, c, p);
            }
        }

        return result;
    }
	
}