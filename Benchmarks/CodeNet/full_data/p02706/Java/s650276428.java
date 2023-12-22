import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        int M = 0;
        int N = 0;
        int A1 = 0;
        int A2 = 0;

        Scanner scan = new Scanner(System.in);
        M = scan.nextInt();
        N = scan.nextInt();
        A1 = scan.nextInt();
        A2 = scan.nextInt();
        
        if(M < (A1 + A2)){
            System.out.println("-1");
        }
        else{
            System.out.println(M - (A1 + A2));
        }
        scan.close();
    }
}