import java.util.Scanner;

public class Main {
    public static boolean debug = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0;i<21;i++){
            if(a*i >=b){
                System.out.println(i);
                return;
            }
        }




    }
    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }

}
