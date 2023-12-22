import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int A, B;
        Scanner scan = new Scanner(System.in);
        A = scan.nextInt();
        B = scan.nextInt();
        if(A==1&&B==2||A==2&B==1){
            System.out.println(3);
        }if(A==1&&B==3||A==3&B==1){
            System.out.println(2);
        }if(A==2&&B==3||A==3&B==2){
            System.out.println(1);
        }
    }
}
