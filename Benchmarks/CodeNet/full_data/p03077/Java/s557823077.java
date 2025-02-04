import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long[] capacities = new long[5];

        for (int i=0; i < 5; i++) {
            capacities[i] = sc.nextLong();
        }

        Arrays.sort(capacities);

        System.out.println(N/capacities[0] + 5);
    }
}
            
