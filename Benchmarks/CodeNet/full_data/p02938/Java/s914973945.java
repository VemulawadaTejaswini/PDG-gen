import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long L = Long.parseLong(sc.next());
        long R = Long.parseLong(sc.next());
        long count = 0L;

		for(long x = L; x <= R; x++){
			for(long y = x; Long.toBinaryString(x).length() == Long.toBinaryString(y).length() && y <= R; y++){
                if(y % x == (y ^ x)){
                    count++;
                }
            }
        }

        System.out.println((int) (count % (Math.pow(10, 9) + 7)));

	}
}