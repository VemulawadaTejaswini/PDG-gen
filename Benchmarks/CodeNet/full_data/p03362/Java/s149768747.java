import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main a = new Main();
        a.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] prime_list = this.get_prime_list();
        List<Integer> answer = new ArrayList<Integer>();
        int count = 0;
        int i = 2;
        for (; i < prime_list.length && count < N; i=i*3) {
            answer.add(prime_list[i]);
            count = count + 1;
        }
        StringBuilder sb = new StringBuilder();

        for (int prime : answer) {
            sb.append(prime + " ");
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }
    private int[] get_prime_list() {
        boolean[] prime = new boolean[55556];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i <= (int) Math.sqrt(55555); i++) {
            if(!prime[i]) {
                continue;
            }
            for (int j = 2; i * j < 55555; j++) {
                if (55555 < i * j) {
                    break;
                }
                prime[i*j] = false;
            }
        }
        List<Integer> prime_list = new ArrayList<>();
        for (int i = 2; i < 55555; i++) {
            if (prime[i]) {
                prime_list.add(i);
            }
        }
        int[] list = new int[prime_list.size()];
        for (int i = 0; i < prime_list.size(); i++) {
            list[i] = prime_list.get(i);
        }
        return list;
    }
}
