
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int color[] = new int[n];
        int node[][] = new int[n-1][2];
        int use[][] = new int[n][n];
        for(int i = 0;i < n;i++)color[i] = 0;
        for(int i = 0;i<n-1;i++){
            node[i][0] = sc.nextInt();
            node[i][1] = sc.nextInt();
           color[node[i][0]-1]++;
           color[node[i][1]-1]++;
        }
        int high = 0;
        for(int i = 0;i < n-1;i++)if(high<color[i]) high = color[i];
        System.out.println(high);
        for(int i = 0;i < n-1;i++){
            for(int j = 0;j < n-1;j++){
                
                if(use[j][node[i][0]-1]==0&&use[j][node[i][1]-1]==0){
                    use[j][node[i][0]-1]=1;
                    use[j][node[i][1]-1]=1;
                    System.out.println(j+1);
                    break;
                }                
            }
        }
    }
}




