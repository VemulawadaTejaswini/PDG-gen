import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = A + B;
        int result;
        int i;
        if((C = 0)){
            result = 0;
        }else{
            result = N % (A + B);
        }
        if(A == 0 || (A + B) == 0){
            i = 0;
        }else{
            i = N / (A + B) * A;
        }

        i = result + i;

        System.out.println(i);
    }
}