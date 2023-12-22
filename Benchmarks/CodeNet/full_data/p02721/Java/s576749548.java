import java.util.*;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int C = sc.nextInt();
        String S = sc.next();
    	int[] s = new int[N];
    	int[] s_ = new int[N];
    	for (int i = 0; i < N; i++) {
    		if (S.charAt(i) == 'o') {
    			s[i] = 1;
    		} else {
    			s[i] = 0;
    		}
    	}
    	for (int i = 0; i < N; i++) {
    		s_[i] = s[N - 1 - i];
    	}
    	List<Integer> workDaysL = new ArrayList<>();
    	List<Integer> workDaysR = new ArrayList<>();
    	for (int i = 0; i < N; i++) {
    		workDaysL = calcWorkDays(s, C, K);
    		workDaysR = calcWorkDays(s_, C, K);
    	}
    	for (int i = 0; i < workDaysR.size(); i++) {
    		workDaysR.set(i, N - workDaysR.get(i) + 1);
    	}
    	int l = workDaysL.size();
    	for (int i = 0; i < l; i++) {
    		for (int j = 0; j < l; j++) {
    			if (workDaysL.get(i) == workDaysR.get(j)) {
    				System.out.println(workDaysL.get(i));
    			}
    		}
    	}
    }

  	public static List<Integer> calcWorkDays(int[] s, int c, int k){
  		List<Integer> result = new ArrayList<>();
  		int count = 0;
  		while (count < s.length) {
  			if (s[count] == 1) {
  				result.add(count + 1);
  				count += c+1;
  			} else {
  				count++;
  			}
  			if (result.size() == k) {
  				break;
  			}
  		}
  		return result;
    }
}