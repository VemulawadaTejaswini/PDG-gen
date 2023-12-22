import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] Ls = new int[M];
        int[] Rs = new int[M];

        for (int i=0; i<M; i++) {
            Ls[i] = sc.nextInt();
            Rs[i] = sc.nextInt();
        }

        Arrays.sort(Ls);
        Arrays.sort(Rs);

        int min = Ls[M-1];
        int max = Rs[0];

        int count = 0;
        for (int i=1; i<N+1; i++) {
            if (min <= i && i <= max) {
                count++;
            }
        }
        System.out.println(count);
    }
}
