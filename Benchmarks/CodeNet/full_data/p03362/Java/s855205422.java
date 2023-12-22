import java.util.ArrayList;
import java.util.Scanner;

class Main {

    private final  ArrayList<Integer> primes = new ArrayList<Integer>();
    private final  ArrayList<Integer> targets = new ArrayList<Integer>();
    private final int n;

    public Main(int n) {
        this.n = n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            int N = Integer.parseInt(scanner.nextLine());

            new Main(N).start();
        }
    }

    private void start() {
        targets.add(3);
        for (int i = 1; true; ++i) {
            if (addAndCheck(i * 6 - 1)) {
                break;
            }
            if (addAndCheck(i * 6 + 1)) {
                break;
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int i : targets) {
            if (builder.length() > 0) {
                builder.append(' ');
            }
            builder.append(i);
        }

        System.out.println(builder);
    }

    private boolean addAndCheck(int num) {
        if (isPrime(num)) {
            primes.add(num);
            if (num % 10 == 3) {
                targets.add(num);
                if (targets.size() >= n) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isPrime(int num) {
        for (int i : primes) {
            if (num % i == 0) {
                return false;
            }
            if (num <= i * i) {
                return true;
            }
        }
        return true;
    }
}