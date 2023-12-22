import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int itarateNum = sc.nextInt();
        
        String msg = "";
        
        for(int i=1; i<=itarateNum; i++){
            boolean endFlag = false;
            
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int dummyX = 0;
            int dummyY = 0;
            
            for(int ii=1; ii<=n; ii++){
                boolean added = false;
                
                if(dummyX<x){
                    dummyX++;
                    added = true;
                }else if(dummyY<y){
                    dummyY++;
                    added = true;
                }
                
                if(!added){
                    if(dummyX>x){
                        dummyX++;
                    }else if(dummyY>y){
                        dummyY++;
                    }
                }
            }
            
            if(dummyX != x || dummyY != y){
                msg = "No";
                endFlag = true;
                break;
            }else{
                msg = "Yes";
            }
            
            if(endFlag){
                break;
            }
        }
        
        System.out.println(msg);

    }
}
