import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int n,b;
        int a[][]  = new int[3][3];
        String ans = "No"; 
        
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = scan.nextInt();
            }
        }
        

        
        n = scan.nextInt();
        
        for(int k = 0; k < n; k++){
            b = scan.nextInt();
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        if(a[i][j] == b){
                            a[i][j] = -1;

                        }
                        if((a[i][0] == -1) && (a[i][1] == -1) && (a[i][2] == -1)){
                            ans = "Yes";
                        }
                        if((a[0][j] == -1) && (a[1][j] == -1) && (a[2][j] == -1)){
                            ans = "Yes";
                        }
                        if((a[0][0] == -1) && (a[1][1] == -1) && (a[2][2] == -1)){
                            ans = "Yes";
                        }
                        if((a[0][2] == -1) && (a[1][1] == -1) && (a[2][0] == -1)){
                            ans = "Yes";
                        }
                    }
                }
            
        }
        
        System.out.println(ans);
    }
}
