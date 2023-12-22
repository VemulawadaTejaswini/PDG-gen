import java.util.Scanner;

class Main {
    public static void main(final String[]  args){
        final Scanner sc = new Scanner(System.in);
        final int A = Integer.parseInt(sc.next());
        final int B = Integer.parseInt(sc.next());
        if (A + B >= 10){
            System.out.println("error");
        }
        else{
            System.out.println(A+B);
        }
        sc.close();
    }
}