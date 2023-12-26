public class Main {
    public static void main (String[] args ) throws IOException{
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] columns = new String[1000];
        columns = line.split(" ");
        int n = Integer.parseInt(columns[0]); 
        int m = Integer.parseInt(columns[1]); 
        int[][] matrix = new int[n][m];
        int[] vector = new int[m];   
        int [] sum =new int[n]; 
        for (int y = 0; y < n; y++) {
            line = reader.readLine();
            columns = line.split(" ");
            for ( int x = 0 ; x < m; x++ ) {
                matrix[y][x] = Integer.parseInt(columns[x]);
            }
        }
        for (int x = 0; x < m; x++) {
            line = reader.readLine();
            vector[x] = Integer.parseInt(line);
        }
        for (int y = 0; y < n ; y++) {
            sum[y] = 0;
            for (int x = 0; x < m ; x++ ) {
                sum[y] += (vector[x] * matrix[y][x]);
            }
            System.out.println(sum[y]);
        }
    }
}
