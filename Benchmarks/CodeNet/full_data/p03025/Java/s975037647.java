import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        double count = 0;
        
        int n = stdIn.nextInt();
        double a = stdIn.nextInt();
        double b = stdIn.nextInt();
        double c = stdIn.nextInt();
        
        double ac = 0;
        double bc = 0;
        
        boolean aflag = true;
        boolean bflag = true;
        
        for(int i = 1; ; i++){
            
            if(a != 0 && aflag){
                ac += a / 100;
            }
            
            if(b != 0 && bflag){
                bc += b / 100;
            }
            
            if(ac >= n && aflag == true){
                count += ac;
                aflag = false;
            }
            
            if(bc >= n && bflag == true){
                count += bc;
                bflag = false;
            }
            
            if(ac >= n && bc >= n){
                break;
            }
            count++;
        }
        
        System.out.println(count / 2);
    }
}