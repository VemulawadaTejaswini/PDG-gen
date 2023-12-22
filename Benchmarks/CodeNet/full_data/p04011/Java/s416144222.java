import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            int n ,k,x,y;
            Scanner input =  new Scanner(System.in);
            n=input.nextInt();
            k=input.nextInt();
            x=input.nextInt();
            y=input.nextInt();

            System.out.println((k*x)+((n-k)*y));
        }

}
