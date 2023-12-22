import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        double c=n+0.5;
        int ans = n/1.08;
        if(n<ans*1.08&&ans*1.08<c)System.out.println(n/1.08);
        else System.out.println(":(");
        scan.close();
    }
}