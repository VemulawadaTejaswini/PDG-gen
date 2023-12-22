import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = Integer.parseInt(scan.next());
        int total = Integer.parseInt(scan.next());
        //int c = Integer.parseInt(scan.next());
//        int cnt = 0;
//        while(h>0) {
//            h = h-a;
//            cnt++;
//        }
        if(cnt*500 >= total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
