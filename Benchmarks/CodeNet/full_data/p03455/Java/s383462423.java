import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        int a=new Scanner(System.in).nextInt();
        int b=new Scanner(System.in).nextInt();
        int c=a*b;
        if(c%2==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");

        }
        


    }
}