import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = Integer.valueOf(sc.next());
        Integer[] ai = new Integer[n];
        for(int i=0; i<n; i++){
            ai[i] = sc.nextInt();
        }
        Arrays.sort(ai ,Comparator.reverseOrder());
        int alice = 0;
        int bob = 0;
        for(int i=0; i < ai.length; i=i+2) {
            alice += ai[i];
        }
        for(int j=1; j< ai.length; j=j+2) {
            bob += ai[j];
        }
        System.out.println(alice - bob);
        sc.close();
    }       
}