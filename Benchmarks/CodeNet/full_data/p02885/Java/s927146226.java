import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        if(A<B*2)System.out.printf("0");
        else System.out.printf("%d",A-B*2);
    }
}