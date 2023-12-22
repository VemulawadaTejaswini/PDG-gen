import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=scan.nextInt();
        int b=scan.nextInt();
        
        if (a==1&&b==n){
            System.out.println("Alice");
        } else if (n%2==0){
                System.out.println("Borys");
        }else {
            System.out.println("Alice");
        }
    }
}
