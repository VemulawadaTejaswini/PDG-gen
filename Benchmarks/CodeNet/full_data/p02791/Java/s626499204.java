import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P;
        int min = 0;
        int counter = 0;
        for(int i = 0; i < N; i++){
            P = sc.nextInt();
            if(min < 1 || P < min){
                min = P;
                counter++;
            }
        }
        
        System.out.println(counter);
    }
}
