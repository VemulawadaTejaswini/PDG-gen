import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int A=scan.nextInt();
        int B=scan.nextInt();
        if(A==1){
            A+=13;
        }
        if(B==1){
            B+=13;
        }
        if(A>B){
            System.out.println("Alice");
        }
        else if(A<B){
            System.out.println("Bob");
        }
        else{
            System.out.println("Draw");
        }
    }
}