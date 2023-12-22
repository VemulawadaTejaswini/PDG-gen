import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        int result = 1;
        int prePosition = 0;
        for(int i=1;i<N;i++){
            
            int position = prePosition + sc.nextInt();
            if(position > X){
                break;
            }
            result ++;
            prePosition = position;
            
        }
        
        System.out.println(result);
        
    }
}
