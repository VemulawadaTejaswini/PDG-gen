import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum=0;
        int B = 0;
        for(int i=0;i<N;i++){
            int A = scan.nextInt();
            B = A;
            sum+=A;
        }
        if(B % 2 == 0 || B % 2 != 0) {
            if(sum % 3 == 0 || sum % 5 == 0){
                System.out.println("APPROVED");
            }
            else if (sum % 3 != 0 || sum % 5 != 0){
                System.out.println("DENIED");
            }
        }
        else {
            System.out.println("DENIED");
        }
    }
}