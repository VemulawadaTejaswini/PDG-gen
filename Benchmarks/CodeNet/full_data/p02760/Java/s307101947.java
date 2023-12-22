import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] [] A = new int [3][3];
        int [] [] B = new int [3][3];
        
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                A[i][j] = sc.nextInt();
                B[i][j] = 0;
            }
        }
        
        int N = sc.nextInt();
        int [] b = new int [N];
        for(int i=0; i<N; i++){
            b[i] = sc.nextInt();
        }
        
        
        for(int k=0; k<N; k++){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(b[k] == A[i][j]){
                    B[i][j] = 1;
                }
            }
        }
        }
        
        boolean judge = false;
        for(int i=0; i<3; i++){
            if(B[i][0] == 1 &&B[i][1] == 1 && B[i][2] == 1){
                judge = true;
                break;
            }
             if(B[0][i] == 1 &&B[1][i] == 1 && B[2][i] == 1){
                judge = true;
                break;
            }
        }
        
        if(B[0][0] == 1 &&B[1][1] == 1 && B[2][2] == 1){
                judge = true;
        }
        if(B[0][2] == 1 &&B[1][1] == 1 && B[2][0] == 1){
                judge = true;
        }
        
        if(judge == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}