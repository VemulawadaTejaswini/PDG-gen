import java.util.*;

public class Main {
    public static int min2(int a,int b){
        return (a<b)?a:b;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        int[][] MAP=new int[H][W];
        int[][] D=new int[H][W];
        
        for(int i=0;i<H;i++){
            String tmp=sc.next();
            for(int j=0;j<W;j++){
                if(tmp.charAt(j)=='#'){
                    MAP[i][j]=1;
                }else{
                    MAP[i][j]=0;
                }
            }
        }
        
        if(MAP[0][0]==0){
            D[0][0]=0;
        }else{
            D[0][0]=1;
        }
        
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                int Upper;
                int Lefty;
                if(i==0&&j==0){
                    continue;
                }
                
                if(i>0&&j>0){
                    if(MAP[i][j]==1&&MAP[i-1][j]==0){
                        Upper=D[i-1][j]+1;
                    }else{
                        Upper=D[i-1][j];
                    }
                    
                    if(MAP[i][j]==1&&MAP[i][j-1]==0){
                        Lefty=D[i][j-1]+1;
                    }else{
                        Lefty=D[i][j-1];
                    }
                    
                    D[i][j]=min2(Upper,Lefty);
                }else if(i==0&&j>0){
                    if(MAP[i][j]==1&&MAP[i][j-1]==0){
                        D[i][j]=D[i][j-1]+1;
                    }else{
                        D[i][j]=D[i][j-1];
                    }
                }else{
                    if(MAP[i][j]==1&&MAP[i-1][j]==0){
                        D[i][j]=D[i-1][j]+1;
                    }else{
                        D[i][j]=D[i-1][j];
                    }
                }
            }
        }
        
        System.out.println(D[H-1][W-1]);
    }
}
