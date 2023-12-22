import java.util.Random;

public class Main {
    public static void main(String[] args){

        int A = ThreadLocalRandom.current().nextInt(1,  20);
        int B = ThreadLocalRandom.current().nextInt(1,  A);

        int differnce = A-B;

        int C = ThreadLocalRandom.current().nextInt(1,  20);

        if (c > differnce) {
            System.out.println(c-differnce);
        } else {
            System.out.println(0);
        }

    }
}