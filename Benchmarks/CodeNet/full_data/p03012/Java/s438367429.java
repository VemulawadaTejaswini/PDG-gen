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
        int min = 0;
        for(int i = 0;;i++){
            count += numbers[i];
            if(count >= (total / 2)){
                min = Math.abs(total - count - count);

                break;
            }
            
        }
        for(int i = n-1;i >= 0;i--){
            count += numbers[i];
            if(count >= (total / 2)){
                if(min > Math.abs((total - count) - count)){
                    min = Math.abs((total - count) - count);
                }
                System.out.println(min);
                return;
            } 
        }
        
    }
    
}