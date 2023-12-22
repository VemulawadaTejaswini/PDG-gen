import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int L,R;
        int min = 0;
        int max = 0;
        L = scan.nextInt();
        R = scan.nextInt();
        min = L;
        max = R;
        for(int i = 1; i<num2; i++){
            L = scan.nextInt();
            R = scan.nextInt();
            if(L > min){
                min = L;
            }
            if(R < max){
                max = R;
            }    
        }
        
        System.out.println(max-min+1);
    }
}
