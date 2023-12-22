import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<50000; i++) {
            if(n == (int)(i * 1.08d)) {
                System.out.println(i);
                return ;
            }
        }
        System.out.println(":(");


    }

}
