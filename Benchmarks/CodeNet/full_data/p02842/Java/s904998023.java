import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
      	double com = n/1.08;
      	com =com*1.08;
        if(n==com)System.out.println(n/1.08);
        else System.out.println(":(");
        scan.close();
    }
}
