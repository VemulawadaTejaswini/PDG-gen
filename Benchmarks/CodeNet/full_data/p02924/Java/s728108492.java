import java.util.Scanner;

public class Main {
    public static boolean debug = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long result = 0;
        for(int i=1;i<=n-1;i++){
            result += i;
        }

        System.out.println(result);



    }

    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }


}
