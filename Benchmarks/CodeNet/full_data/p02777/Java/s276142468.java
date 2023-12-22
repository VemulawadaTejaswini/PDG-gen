import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();
        String S = scan.nextLine();
        int A = scan.nextInt();
        int B = scan.nextInt();
        scan.nextLine();
        String U = scan.nextLine();
        if(U.equals(T)){
            A=A-1;
        }else{
            B=B-1;
        }
        System.out.println(A);
        System.out.println(B);
    }
}