import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int sum = 0;
        int count = 0;
        
        for(int i=0; i<=25; i++){
            for(int j=0; j<=14; j++){
                sum = 4*i + 7*j;
                if(sum == N){
                    count++;
                }
            }
        }
        
        if(count >= 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}