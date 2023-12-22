import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w=sc.nextInt();
        long h=sc.nextInt();
        long x=sc.nextInt();
        long y=sc.nextInt();
       System.out.println((w*h)*0.5+" "+(w==x*2 && h==y*2 ? 1:0));
    }
}
