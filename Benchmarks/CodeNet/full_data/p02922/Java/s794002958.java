import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int A = scan.nextInt();
        final int B = scan.nextInt();
        scan.close();
        int result = 1;
        int count = A;
        if(A >= B){
        }
        else{
            while(true){
                result++;
                count = count+(A-1);
                if(count >= B){
                    break;
                }  
            }
        }
        System.out.println(result);
        
    }
    
}
