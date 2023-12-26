public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] m = new int[N];
        for(int i = 0; i < N; i++){
            m[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            X -= m[i];
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++){
            min = Math.min(min,m[i]);
        }
        System.out.println(N + (X / min));
    }
}
