import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer X = Integer.parseInt(scan.next());
        Integer A = Integer.parseInt(scan.next());

        System.out.println(X < A ? 0 : 10);
    }
}