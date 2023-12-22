import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int num[] = new int[n];
        
        for(int i = 0; i < n; i++){
            num[i] = stdIn.nextInt();
        }
        
        int max = 0;
        int semax = 0;
        
        for(int i = 0; i < n; i++){
            if(num[i] >= max){
                semax = max;
                max = num[i];
                //System.out.println(max + " " + semax);
            }else if (num[i] >= semax){
                semax = num[i];
            }
        }
        
        for(int i = 0; i < n; i++){
            if(max == num[i]){
                System.out.println(semax);
            }else{
                System.out.println(max);
            }
        }
    }
}
