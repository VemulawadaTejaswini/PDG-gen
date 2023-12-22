import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] As = new int[N];
        
        for (int i=0; i<N; i++) {
            As[i] = sc.nextInt();
        }
        Arrays.sort(As);
        System.out.println(As[N-1] - As[0]);
    }
}

