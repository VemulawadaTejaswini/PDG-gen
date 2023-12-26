public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] arr1 = br.readLine().split(" ");
            int n = Integer.parseInt(arr1[0]), m = Integer.parseInt(arr1[1]);
            int[][] A = new int[n][m];
            int[] b = new int[m];
            for(int i=0; i<n; i++) {
                String[] arr2 = br.readLine().split(" ");
                for(int j=0;j<m;j++){
                    A[i][j] = Integer.parseInt(arr2[j]);
                }
            }
            for(int i=0; i<m; i++) {
                b[i] = Integer.parseInt(br.readLine());
            }
            for(int i=0; i<n; i++) {
                int tmp = 0;
                for(int j=0; j<m; j++){
                    tmp += A[i][j]*b[j];
                }
                System.out.printf("%d\n", tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
