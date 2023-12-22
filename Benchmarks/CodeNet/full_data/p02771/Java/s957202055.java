import java.util.Scanner;

class Poor{

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A, B, C;        
        do{
            A = stdIn.nextInt();
        }while(A<0 || A>9);

        do{
           B = stdIn.nextInt();
        }while(B<0 || B>9);

        do{
           C = stdIn.nextInt();
        }while(C<0 || C>9);

        if(A==B && A != C)
            System.out.println("Yes");
        if(A==C && A != B)
            System.out.println("Yes");
        if(B==C && C != A)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}