import java.util.Scanner;

public class Main
{
    static long get(long n) {
        int count = 0;
        while (n > 0) {
            if (n % 5 == 0) {
                count++;
                n /= 5;
            }
            else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = 0;
        long step = 10;

        while (n > 0) {
            n /= 10;

            long val = n % 10;
            long fives = get(step);

            count += val * fives;

            step *= 10;
        }

        System.out.println(count);
    }
}
