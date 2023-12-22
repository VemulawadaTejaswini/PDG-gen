import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] cities = new int[N];
        for(int i=0; i<M; i++) {
            cities[sc.nextInt()-1]++;
            cities[sc.nextInt()-1]++;
        }

        for(int i: cities) {
            System.out.println(i);
        }
    }
}
