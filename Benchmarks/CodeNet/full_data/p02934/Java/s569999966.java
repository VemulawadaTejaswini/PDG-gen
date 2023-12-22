import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a;
        double b=0;
        double ans;

        for(int i=0;i<n;i++){
            a=scan.nextInt();
            b+=1.0/a;
//            System.out.println(b);
        }

        ans=1/b;
        System.out.println(ans);
    }
}