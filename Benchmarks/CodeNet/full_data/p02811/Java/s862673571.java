import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int X = scanner.nextInt();
        
        if((K * 500) >= X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}
}