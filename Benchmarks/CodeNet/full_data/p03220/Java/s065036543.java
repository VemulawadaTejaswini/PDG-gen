import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int T = Integer.parseInt(scan.next());
        int A = Integer.parseInt(scan.next());
        int H;
        int temp;
        int res = 0;
        int cc = 1000000000;

        int i =0;
        for(i = 1; i <= N; i++){

            H = Integer.parseInt(scan.next());
            temp = T*1000 - H * 6 - A*1000;
            if(temp < 0 ) temp = -temp;
            if(temp < cc){
                cc = temp;
                res = i;
            }
        }

        System.out.println(res);
    }
}