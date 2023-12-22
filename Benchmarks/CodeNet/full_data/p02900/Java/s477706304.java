import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> commonDivistors = commonDivistors(a, b);

        int count = 0;
        for (int i = 0; i < commonDivistors.size(); i++) {
            int num = commonDivistors.get(i);
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println(count+1);
    }

    private static boolean isPrime(long n) {
        if (n < 2) return false;
        else if (n == 2) return true;
        else if (n % 2 == 0) return false;

        double sqrtNum = Math.sqrt(n);
        for (long i = 3; i <= sqrtNum; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> primes(List<Integer> commons) {

        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i < commons.size(); i++) {

            List<Integer> list = new ArrayList<>();
            for(int j = 1; j <= commons.get(i); j++) {
                if(commons.get(i) % j == 0) {
                    list.add(j);
                } 
            }

            if(list.size() <= 2) {
                primes.add(commons.get(i));
            }
        }

        return primes;
    }

    private static List<Integer> commonDivistors(int a, int b) {
        List<Integer> aList = divistors(a);
        List<Integer> bList = divistors(b);
        
        List<Integer> commonDivistors = new ArrayList<>();
        for (int i : aList) {
            if (bList.contains(i)) {
                commonDivistors.add(i);
            }
        }
        return commonDivistors;
    }

    private static List<Integer> divistors(int number) {
        List<Integer> divistors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number%i == 0) {
                divistors.add(i);
            }
        }
        return divistors;
    }
}