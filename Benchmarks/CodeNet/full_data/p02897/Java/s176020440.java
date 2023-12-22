import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double n;
        n=scan.nextDouble();
        System.out.println(((n+n%2)/2)/n);
    }
}