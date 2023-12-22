import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    ArrayList<Long> al = new ArrayList();

	    for(int i=0; i<N; ++i) {
//	        as[i] = sc.nextInt();
            al.add(sc.nextLong());
        }
        long r = 0;

	    for(int l=0; l<N-1; ++l) {
            int idx = -1;
            long idxSum = Long.MAX_VALUE;
            for(int i=0; i<al.size()-1; ++i) {
                long tSum = al.get(i) + al.get(i+1);

                if(idxSum != Math.min(tSum, idxSum)) {
                    idxSum = tSum;
                    idx = i;
                }
            }

            r += idxSum;
            al.set(idx, al.get(idx) + al.get(idx +1));
            al.remove(idx+1);
        }
        System.out.println(r);
    }
}
