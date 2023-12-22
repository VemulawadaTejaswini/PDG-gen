import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    long result = execute(sc.nextLong(),sc.nextLong());
        System.out.println(result);
    }

    public static long execute(long n, long k){
        long plusTreated = n % k;
        long minusTreated =Math.abs( plusTreated - k);
        long treated = Math.min(plusTreated,minusTreated);
        if(n > treated) return execute(treated,k);
        return treated;
    }
}
