import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int result = N % (A + B);
        int i = 0;

        for(i = 0; i <= N; i++){
            i = A + B;
        }
        if(i > N){
            i = i - B;
        }
        if(i > N){
            i = i - A;
        }

        i = i + result;

        System.out.println(i);
    }
}