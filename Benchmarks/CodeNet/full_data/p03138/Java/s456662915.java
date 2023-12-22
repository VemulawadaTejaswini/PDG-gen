import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] A = new int[N];
        ArrayList<Integer> sum = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        int s = 0;
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < N; j++) {
                s += i^A[j];
            }
            sum.add(s);
            s = 0;
        }
        Collections.sort(sum, Collections.reverseOrder());
        System.out.println(sum.get(0));
        
    }
}