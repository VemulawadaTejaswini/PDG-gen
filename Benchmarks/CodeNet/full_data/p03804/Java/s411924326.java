import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a=null;
        String b=null;
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        for (int i = 0; i <n ; i++) {
            a=scan.next();
        }
        for (int i = 0; i <m ; i++) {
             b=scan.next();
        }
        if (a.indexOf(b)!=-1){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
