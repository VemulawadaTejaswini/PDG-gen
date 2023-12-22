import java.util.Scanner;

public class Main {

    public static  void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        x = Math.sqrt(x);
        int ans = (int)x;
        System.out.println(ans*ans);
    }
}
