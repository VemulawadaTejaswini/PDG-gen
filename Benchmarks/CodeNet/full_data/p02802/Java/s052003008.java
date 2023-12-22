import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
      Set<Integer> ac = new HashSet<>();
      int penalty = 0;
      int total = 0;
		for (int i = 0; i < M; i++) {
         int p = sc.nextInt();
		   String result = sc.next();
         if (result.equals("AC")) {
            ac.add(p);
            total+=penalty;
            penalty=0;
         } else {
            if (!ac.contains(p)) {
               penalty++;
            }
         }
      }
		System.out.println(ac.size() + " " + total);
	}
}