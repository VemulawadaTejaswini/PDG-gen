import java.util.*;
public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int A = sc.nextInt();
        int cnt = 0;
        
        for(int i=0;i<(10*10*10*10);i++){
        	H -= A;
            cnt++;
            if(H<=0){
            	System.out.println(cnt);
                System.exit(0);
            }
        }
        //System.out.println(R);
    }
}