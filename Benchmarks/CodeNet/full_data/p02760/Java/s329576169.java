import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int[][] b = new int[3][3];
        String ans="No";
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                b[i][j] = sc.nextInt();
            }
        }
        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int k=0; k<n; k++){
            a[k] = sc.nextInt();
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    if(b[i][j]==a[k]){
                        b[i][j]=0;
                    }
                }
            }
        }
        
        if(b[0][0]==0 && b[0][1]==0 && b[0][2]==0){
            ans="Yes";
        }
        if(b[1][0]==0 && b[1][1]==0 && b[1][2]==0){
            ans="Yes";
        }
        if(b[2][0]==0 && b[2][1]==0 && b[2][2]==0){
            ans="Yes";
        }
        if(b[0][0]==0 && b[1][0]==0 && b[2][0]==0){
            ans="Yes";
        }
        if(b[0][1]==0 && b[1][1]==0 && b[2][1]==0){
            ans="Yes";
        }
        if(b[0][2]==0 && b[1][2]==0 && b[2][2]==0){
            ans="Yes";
        }
        if(b[0][0]==0 && b[1][1]==0 && b[2][2]==0){
            ans="Yes";
        }
        if(b[0][2]==0 && b[1][1]==0 && b[2][0]==0){
            ans="Yes";
        }
        
        System.out.println(ans);
        
	}
}
