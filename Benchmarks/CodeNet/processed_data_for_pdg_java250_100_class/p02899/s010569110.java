public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        int[] A = new int[N];
        String[] s = stdR.readLine().split(" ");
        for(int i = 0; i < N; i++){
            A[Integer.parseInt(s[i]) - 1] = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(A[i]);
            if( i != N - 1) sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
