import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();

        if(A + B > A - B)
            if(A + B > A * B)
                System.out.println(A + B);
            else
                System.out.println(A * B);
        else if(A - B > A * B)
                System.out.println(A - B);
        else
            System.out.println(A * B);
    }
}