import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int A =  scan.nextInt();
        int B =  scan.nextInt();
        if(A==1&&B==2)System.out.printf("3");
        if(A==1&&B==3)System.out.printf("2");
        if(A==2&&B==3)System.out.printf("1");
        if(A==2&&B==1)System.out.printf("3");
        if(A==3&&B==1)System.out.printf("2");
        if(A==3&&B==2)System.out.printf("1");
    }
}