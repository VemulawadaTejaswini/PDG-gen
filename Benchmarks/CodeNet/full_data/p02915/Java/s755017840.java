import java.util.Scanner;

public class Main {
    public static boolean debug = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = n*n*n;

        System.out.println(ans);

    }


    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }
}