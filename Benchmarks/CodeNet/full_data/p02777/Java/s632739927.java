import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);

        String S = scan.next();
        String T = scan.next();
        int A = scan.nextInt();
        int B = scan.nextInt();
        String U = scan.next();
        if(S.equals(U)) A=A-1;
        else B=B-1;
        System.out.printf("%d %d",A,B);

    }
}