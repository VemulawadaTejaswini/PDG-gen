import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int k,x;
        k=scan.nextInt();
        x=scan.nextInt();
        if(k*500>=x) System.out.println("Yes");
        else System.out.println("No");
    }
}