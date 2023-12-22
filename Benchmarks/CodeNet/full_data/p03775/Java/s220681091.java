import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        int ans =0;
        for(int i=1;i*i<=N;i++){
            if(N%i==0){
                ans =Math.max(ans,i);
            }
        }
        int digit = String.valueOf(N/ans).length();
        System.out.println(digit);
    }
}
