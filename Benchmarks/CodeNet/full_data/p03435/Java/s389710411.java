import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int [][] List = new int[3][3];
        int a[]=new int[3];
        int b[]=new int[3];
        
        for(int i=0;i<3;i++){
            
            for(int j=0;j<3;j++){
                List[i][j] =sc.nextInt();
                
            }
        }
        a[0]=0;
        for(int i=0; i<3; i++) {
            
            b[i] = List[0][i] - a[0];
        }
        for(int i=0; i<3; i++) {
        
            a[i] = List[i][0] - b[0];
        }
        
        
        for(int i=0; i<3; i++) {
           for(int j=0; j<3; j++) {
                if(List[i][j] != a[i]+b[j]) {
                    System.out.println("No");
                    return;
                }
            }
        }
        
        System.out.println("Yes");
        
        
    }       
    
        
}
