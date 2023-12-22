import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();

        int power = 0;
        while (Math.pow(2, power) * X <= Y) {
            power++;
        }
        System.out.println(power);
    }
}