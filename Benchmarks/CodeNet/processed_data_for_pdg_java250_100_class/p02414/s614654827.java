public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int [][] a = new int[n][m];
        int [][] b = new int[m][l];
        long [][] c = new long[n][l];
        int i;
        int j;
        int k;
        for( i = 0; i < n; i++){
          for( j = 0; j < m; j++){
              a[i][j] = sc.nextInt();
          }
        }
        for(i = 0;i<m;i++){
            for(j = 0;j<l;j++){
                b[i][j] = sc.nextInt();
            }
        }
        for ( i = 0; i < n; i++){
            for ( j = 0; j < l; j++){
                for ( k = 0; k < m; k++){
                   c[i][j] += ( a[i][k]*b[k][j]);
                }
            }
        }
        for( i = 0; i < n; i++){
            for( j = 0; j < l; j++){
                if(!(j==l-1)){
                System.out.print(c[i][j] +" ");
                }else if(j == l-1){
                    System.out.println(c[i][j]);
                }
            }
        }
    }
}
