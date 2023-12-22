import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long L = Long.parseLong(sc.next());
        long R = Long.parseLong(sc.next());
        long count = 0L;

		for(long x = L; x <= R; x++){
            double n = Math.pow(2, (int) (Math.log(R) / Math.log(2)) + 1);
            n = n > R ? R : n;
            for(long y = x; y <= n; y++){
                if(y % x == (y ^ x)){
                    count++;
                }
            }
        }

        System.out.println((int) (count % (Math.pow(10, 9) + 7)));

	}
}