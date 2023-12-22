import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long L = Long.parseLong(sc.next());
        long R = Long.parseLong(sc.next());
        long count = 0L;

		for(long x = L; x <= R; x++){
            long max = Long.parseLong(Long.toBinaryString(x).replaceAll("0", "1"));
            max = max > R ? R : max;
            for(long y = x; y <= max; y++){
                if(y % x == (y ^ x)){
                    count++;
                }
            }
        }

        System.out.println((int) (count % (Math.pow(10, 9) + 7)));

	}
}