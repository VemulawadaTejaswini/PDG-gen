import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);

        String[] a[] = new String[n][n];
        for(int i=0; i<n; i++){
            a[i] = br.readLine().split("");
        }

        String[] b[] = new String[m][m];
        for(int i=0; i<m; i++){
            b[i] = br.readLine().split("");
        }


        for(int i=0; i<n-m+1; i++){
            for(int j=0; j<n-m+1; j++){

                boolean match = true;
                for(int k=0; k<m; k++){
                    for(int l=0; l<m; l++){
                        if(!a[i+k][j+l].equals(b[k][l])) match = false;
                        if(!match) break;
                    }

                }
                if(!match){
                    break;
                } else {
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
        }

        System.out.println("No");
    }
}

