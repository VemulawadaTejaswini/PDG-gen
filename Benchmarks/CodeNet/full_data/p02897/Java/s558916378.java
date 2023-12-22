
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        taskA();
    }

    public static void taskA(){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int count = 0;

        for(int i = 1; i <= n; i++){
            if(i % 2 != 0) count++;
        }

        double d = (double) count / n;

        System.out.println(d);
    }
}
