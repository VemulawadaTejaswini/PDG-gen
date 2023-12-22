import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                int n = sc.nextInt();
                int m = sc.nextInt();
                int[][] l = new int[2][m];
                int[] q = new int[n];
                Arrays.fill(q , m);
                for(int i = 0 ; i < m ; i++){
                        for(int j = 0 ; j < 2 ; j++){
                                l[j][i] = sc.nextInt() - 1;
                        }
                        for(int ii = l[0][i] ; ii <= l[1][i] ; ii++){
                                q[ii]--;
                        }
                }
                Arrays.sort(q);
                int yono = -1;
                boolean ebishu = true;
                while(ebishu){
                        yono++;
                        if(yono == n) ebishu = false;
                        else if(q[yono] == n) ebishu = false;
                }
                System.out.println(yono);
                sc.close();
        }
}