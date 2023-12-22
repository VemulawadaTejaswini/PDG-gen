import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];
        int total = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            numbers[i] = Integer.parseInt(sc.next());
            total += numbers[i];
        }
        for(int i = 0;;i++){
            count += numbers[i];
            if(count >= (total / 2)){
                System.out.println( Math.abs(total - count - count ));
                return;
            }
        }
        
    }
    
}