import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        double distance = 0;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        for (int j = 0; j <= N - 1; j++) {
            if (j < N - 1) {
                distance = Math.sqrt(Math.pow(x[j] - x[j + 1], 2) + Math.pow(y[j] - y[j + 1] , 2));
            }
            if (j == N - 1) {
                distance = Math.sqrt(Math.pow(x[N - 1] - x[0], 2) + Math.pow(y[N - 1] - y[0] , 2));
            }
            sum += distance;
        }
        System.out.println(((N - 1) * sum) / N);

    }
}