import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
        int a[] = new int[n-1];
        int b[][] = new int[n][30];
        int ans[] = new int[c]; 
        
        for(int i=0; i<c; i++){
            ans[i] = sc.nextInt();
        }
        
        for(int i=0; i<n-1; i++){
            a[i] = sc.nextInt();
            for(int j=0; j<a[i]; j++){
                b[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<c; i++){
            for(int j=0; j<n-1; j++){
                for(int k=0; k<a[j]; k++){
                    if(ans[i] != b[j][k]){
                        ans[i] = 0;
                    }
                }
            }
        }
        
        int flg = 0;
        
        for(int i=0; i<c; i++){
            if(ans[i]!=0){
                System.out.println(ans[c]);
                flg = 1;
            }
        }
        
        if(flg == 0){
            System.out.println(0);
        }
    }
}