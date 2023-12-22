import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        double k = (double)(l / 3.0);
        double tai = k * k * k;
        System.out.println(tai);
        sc.close();
    }
}