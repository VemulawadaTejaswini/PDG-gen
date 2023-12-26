public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt(),m=sc.nextInt(),l=sc.nextInt();
        int[][] a=new int[n][m];
        int[][] b=new int[m][l];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                b[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                long c=0;
                for (int k = 0; k < m; k++) {
                    c+=(long) a[i][k]*(long) b[k][j];
                }
                out.print(c);
                if(j!=l-1)out.print(" ");
                else out.println();
            }
        }
    }
}
