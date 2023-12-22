import java.util.Scanner;

/**
 *
 * @author ena000078
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int l[] = new int[N];
        for (int i=0;i<N;i++){
            l[i] = sc.nextInt();
        }
        
        l = MaxSort(l);
        
        int len = 0;
        for(int i=0;i<K;i++){
            len += l[i];
        }
        System.out.println(len);
    }
    static int[] MaxSort(int[] s){
        int ans[] = s;
        
        for (int i=0;i<ans.length;i++){
            int max = ans[i];
            for (int k=i+1;k<ans.length;k++){
                if (max < ans[k]){
                    ans[i] = ans[k];
                    ans[k] = max;
                    max = ans[i];
                }
            }
        }
        return ans;
    }
}