public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n;
        n = Integer.parseInt(br.readLine());

        if (n >= 2) {
          int a[]=new int[n];
            String line = br.readLine(); // to read multiple integers line
            String[] strs = line.trim().split("\\s+");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(strs[i]);
            }
          int x[][]=new int[n][n];
          for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                  if(i==0)
                      x[i][j]=a[j];
                  else if((i>=1&&i<n)&&(j>=0&&j<(n-i)))
                      x[i][j]=Math.abs(x[i-1][j] - x[i-1][j+1]);
              }
          }
            System.out.println(x[n-1][0]);
        }
    }
}
