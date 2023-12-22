import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);
        int H =sc.nextInt();
        int W =sc.nextInt();
        String[][] S =new String[H][W];
        
        boolean[] b1 =new boolean[H];
        boolean[] b2 =new boolean[W];
        
        for(int i=0;i<H;i++) {
            
            S[i]=sc.next().split("");
            for(int j=0;j<W;j++) {
                
                if(S[i][j].equals("#")) {
                    
                    b1[i]=true;
                    b2[j]=true;
                }
            }
        }
    
        for(int i=0;i<H;i++){
            
            
            if(b1[i]) {
                
                for(int j=0;j<W;j++) {
                    
                    if(b2[j]) {
                        System.out.print(S[i][j]);
                    }
                }
            System.out.println("");
        }
    }

        
    }
    
} 