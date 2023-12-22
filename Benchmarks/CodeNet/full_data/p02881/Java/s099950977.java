import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        long n = sc.nextLong();

        long max = 1;

        for (long i=1; i<=Math.sqrt(n)+1; i++) {
            if (n % i == 0) max = Math.max(max, i);
        }

//        System.out.println(max);

        System.out.println(n/max + max - 2);


    }


}
