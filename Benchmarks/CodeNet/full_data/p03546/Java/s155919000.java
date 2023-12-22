
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int[][] minpath(int[][] c){
        int[][] path = c.clone();
        /*
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++){
                path[i][j] = Integer.MAX_VALUE;
            }
        }
        */

        for(int k=0; k<c.length; k++){
            for(int i=0; i<c.length; i++){
                for(int j=0; j<c.length; j++){
                    path[i][j] = Math.min(path[i][j], path[i][k]+path[k][j]);
                }
            }
        }
        return path;
    }

    static int minMF(int[][] c, int[][] A){
        int result = 0;
        int[][] minpath = minpath(c);
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                if(A[i][j] == -1) continue;
                else result += minpath[A[i][j]][1];
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputstr = br.readLine().trim().split(" ");
        int[][] A = new int[Integer.parseInt(inputstr[0])][Integer.parseInt(inputstr[1])];
        int[][] c = new int[10][10];
        for(int i=0; i<c.length; i++){
            inputstr = br.readLine().trim().split(" ");
            for(int j=0; j<c[0].length; j++){
                c[i][j] = Integer.parseInt(inputstr[j]);
            }
        }
        for(int i=0; i<A.length; i++){
            inputstr = br.readLine().trim().split(" ");
            for(int j=0; j<A[0].length; j++){
                A[i][j] = Integer.parseInt(inputstr[j]);
            }
        }
        System.out.println(minMF(c, A));

    }
}