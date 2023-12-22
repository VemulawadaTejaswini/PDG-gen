import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if(1 == n%m){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }

}