import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int N = scanner.nextInt();
        int sum = 0;
        
        for(int i=0; i<N; i++){
            
            int A = scanner.nextInt();
            sum += A;
            
        }
        if(sum<=H){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
