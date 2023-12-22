import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long max = 0L;
        int Bi = 0;
        int save = Integer.MAX_VALUE;
        for (int i = 0; i < N - 1; i++) {
        	Bi = sc.nextInt();
        	if (Bi < save) {
        		max += Bi;
        		save = Bi;
        	} else {
        		max += save;
        		save = Bi;
        	}
        }
        System.out.println(max + save);
    }
}