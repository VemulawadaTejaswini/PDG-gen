import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
      Set<Integer> ac = new HashSet<>();
      int[] penalty = new int[N];
      int total = 0;
		for (int i = 0; i < M; i++) {
         int p = sc.nextInt();
		   String result = sc.next();
         if (result.equals("AC")) {
            if (!ac.contains(p)) {
               ac.add(p);
               total+=penalty[p-1];
            }
         } else {
            if (!ac.contains(p)) {
               penalty[p-1]++;
            }
         }
      }
		System.out.println(ac.size() + " " + total);
	}
}