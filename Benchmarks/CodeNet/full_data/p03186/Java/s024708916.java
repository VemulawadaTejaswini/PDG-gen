import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        Boolean poison = false;
        int delicious_cookies = 0;
        
        while(true){
            if(C != 0 && !(poison)){
                C--;
                delicious_cookies++;
            }
            else if(B != 0){
                B--;
                delicious_cookies++;
                if(poison){
                    poison = false;
                }                
            }
            else if(A != 0){
                A--;
                if(poison){
                    poison = false;
                } 
            }
            else{
                break;
            }
        }
        
        System.out.println(delicious_cookies);
    }
}
