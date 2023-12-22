
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int C=scanner.nextInt();
        int X=scanner.nextInt();
        int Y=scanner.nextInt();
        long min=Long.MAX_VALUE;
        for(int i=0;i<=Math.max(X,Y);i++){
            long price=Math.max(0,X-i)*A+Math.max(0,Y-i)*B+2*C*i;
            if(price<min){
                min=price;
            }
        }
        System.out.println(min);

    }
}
