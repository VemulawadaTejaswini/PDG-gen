import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();

        double sum = 0;
        int ans = 0;
        double[] list = new double[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextDouble();
            sum += list[i];
        }

        int mid = (int) Math.round(sum / N);

        for (int i = 0; i < N; i++) {
            ans += Math.pow(list[i]-mid,2);
        }

        System.out.println(ans);
    }
}