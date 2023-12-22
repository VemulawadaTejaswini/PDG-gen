import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        sc.close();
        for(long i = 1;true;i++){
            for(long j = 1;true;j++){
                if((i*j)==N){
                    System.out.println((i-1) + (j-1));
                    return;
                }
                if((i*j) > N){
                    break;
                }
            }
        }
    }
}