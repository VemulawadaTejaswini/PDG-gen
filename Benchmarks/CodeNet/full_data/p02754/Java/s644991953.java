import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a + b;
        int count = 0;
        if(a == 0){
            System.out.println(0);
        }
        int num = n / sum;
        count = num * a;
        int c = n % sum;
        if(c < a){
            count = count + c;
        }else if(c >= a){
            count = count + a;
        }
        System.out.println(count);
    }

}