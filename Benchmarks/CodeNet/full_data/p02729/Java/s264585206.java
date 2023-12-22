import java.util.*;

public class Main {
    public static void main(String [] args)
    {
        long even, odd;


        Scanner sc = new Scanner(System.in);
        even = sc.nextLong();
        odd = sc.nextLong();

        long evenTot = (even*(even-1))/2;
        long oddTot = (odd*(odd-1))/2;
        System.out.print(evenTot+oddTot);
    }
}
