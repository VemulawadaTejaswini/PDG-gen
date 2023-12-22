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
        int A = sc.nextInt();
        int B = sc.nextInt();
        int h[] = new int[N];
        int hs[];
        
        for(int i=0;i<N;i++){
            h[i] = sc.nextInt();
        }
        
        hs = sort(h);
        
        int atkCount = 0;
        while(true){
            int hsCount = 0;
            for(int i=0;i<hs.length;i++){
                if(i==0){
                    hs[i] -= A;
                }else{
                    hs[i] -= B;
                }
                if (hs[i] > 0){
                    hsCount++;
                }
            }
            atkCount++;
            
            if (hsCount <= 0){
                break;
            }
            hs = sort(hs);
        }
        System.out.println(atkCount);
    }
    /*大きい順にソート*/
    static int[] sort(int s[]){
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