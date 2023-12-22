import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();
        if(N == 0){
            System.out.println(0);
        }
        else{
            int sum = 1;
            for(int i=1;i<=N;i++){
                sum += i*4;
            }
            char hamb[] = new char[sum];
            hamb[0] = 'P';
            
            int count=0;
            for(int i = 0; i < hamb.length;i++){
                if(hamb[i] == 'P'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
