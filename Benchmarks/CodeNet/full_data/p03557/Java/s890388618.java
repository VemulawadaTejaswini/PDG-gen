import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
    
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }
        int ans = 0;
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                for(int l=0;l<N;l++){
                    if(A[i]<=B[j] && B[j]<=C[l]){
                        ans += 1;
                    }
                }
            }
        }
        
        System.out.println(ans);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
    }
}