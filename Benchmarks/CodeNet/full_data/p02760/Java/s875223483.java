import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int A[] = new int [9];
        int ans[] = new int [9]; 
        
        for(int i=0;i<9;i++){
                A[i] = sc.nextInt();
        }
        int N = sc.nextInt();
        int B[] = new int[N];
        for(int i = 0; i < N; i++){
            
            B[i] = sc.nextInt();
            
            for(int j = 0; j < 9; j++){
                
                if(B[i] == A[j]){
                    
                    ans[j] = 1;
                }
                
            }
            
        }
        
        if(ans[0]==1&&ans[1]==1&&ans[2]==1){
            
            System.out.println("Yes");
            
        }else if(ans[3]==1&&ans[4]==1&&ans[5]==1){
            
            System.out.println("Yes");
            
        }else if(ans[6]==1&&ans[7]==1&&ans[8]==1){
            
            System.out.println("Yes");
            
        }else if(ans[0]==1&&ans[4]==1&&ans[8]==1){
            
            System.out.println("Yes");
            
        }else if(ans[0]==1&&ans[3]==1&&ans[6]==1){
            
            System.out.println("Yes");
            
        }else if(ans[1]==1&&ans[4]==1&&ans[7]==1){
            
            System.out.println("Yes");
            
        }else if(ans[2]==1&&ans[5]==1&&ans[8]==1){
            
            System.out.println("Yes");
            
        }else if(ans[2]==1&&ans[4]==1&&ans[6]==1){
            
            System.out.println("Yes");
            
        }else{
            System.out.println("No");
        }
        
    }
}
