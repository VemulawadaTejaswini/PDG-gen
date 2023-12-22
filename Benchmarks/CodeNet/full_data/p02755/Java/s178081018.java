import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int result = -1;

        for(int i = 0;i<1010;i++) {
            if( (int)(i*0.1) == B && (int)(i*0.08) == A){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}