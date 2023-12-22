import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double ans = 1; 
        for(int i = 2; i < x ; i++){
            if(x == 1){
                break;
            }
            for(int j = 2; Math.pow(i,j) <= x; j++){
                if(Math.pow(i,j) > ans){
                    ans = Math.pow(i,j);
                }    
            }
        }
        System.out.println((int)ans);
    }
}
