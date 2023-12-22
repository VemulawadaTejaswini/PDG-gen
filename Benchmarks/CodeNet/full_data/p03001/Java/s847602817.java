import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if ( (x==0||x==W) && (y==0||y==H) ){
            System.out.println(String.format("%f %d",0.0,1));
            return;
        }
        
        int msa1 = calcMinSideArea(W,H,x);
        int msa2 = calcMinSideArea(H,W,y);
        
        if(msa1 == msa2){
            System.out.println(String.format("%f %d",(float)msa1,1));
        }else{
            if(msa1<msa2){
                System.out.println(String.format("%f %d",(float)msa2,0));
            }else{
                System.out.println(String.format("%f %d",(float)msa1,0));
            }
        }
        
        
    }
    
    public static int calcMinSideArea(int x, int y, int xx){
        int r1 = xx * y;
        int r2 = (x - xx) * y;
        return r1<=r2?r1:r2;
    }
}
